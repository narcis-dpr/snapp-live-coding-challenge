package cab.snapp.livecoding.ui.leak

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cab.snapp.livecoding.databinding.LeakFragmentBinding

class LeakFragment : Fragment() {

    companion object {
        fun newInstance() = LeakFragment()
    }

    private lateinit var viewModel: LeakViewModel

    private var _binding: LeakFragmentBinding? = null
    private val binding get() = _binding!!

    private val handler: Handler = @SuppressLint("HandlerLeak") object : Handler() {
        override fun handleMessage(msg: Message) {
            Log.e("MemoryLeak", "message")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = LeakFragmentBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LeakViewModel::class.java)

        handler.postDelayed({
            Log.e("MemoryLeak", "task start");
        }, 10000)

    }

    // you should implement your code here
    // you should find all the leakages leakage first, then fix it.

}