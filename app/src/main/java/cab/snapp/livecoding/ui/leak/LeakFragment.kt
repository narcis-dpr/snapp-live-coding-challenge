package cab.snapp.livecoding.ui.leak

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import cab.snapp.livecoding.databinding.LeakFragmentBinding

class LeakFragment : Fragment() {

    companion object {
        fun newInstance() = LeakFragment()
    }

    private lateinit var viewModel: LeakViewModel

    private var _binding: LeakFragmentBinding? = null
    private val binding get() = _binding!!

    private var handler: Handler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: Message) {
            Log.e("MemoryLeak", "message")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = LeakFragmentBinding.inflate(inflater, container, false)
        val rootView = binding.root
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LeakViewModel::class.java)

//        viewLifecycleOwner.lifecycleScope.launch {
//            delay(10000) // 10-second delay
//            Log.e("MemoryLeak", "task start")
//            // Perform your task here
//        }

        handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            Log.e("MemoryLeak", "task start")
        }, 10000)

        viewLifecycleOwner.lifecycle.addObserver(object : DefaultLifecycleObserver {
            override fun onDestroy(owner: LifecycleOwner) {
                // Remove callbacks and messages when the view is destroyed
                handler.removeCallbacksAndMessages(null)
            }
        })
    }

    override fun onDestroy() {
        handler.removeCallbacksAndMessages(null)
        _binding = null
        super.onDestroy()
    }

    // you should implement your code here
    // you should find all the leakages leakage first, then fix it.
}

//    fun newInstance(param1: String, param2: String) =
//        BlankFragment().apply {
//            arguments = Bundle().apply {
//                putString(ARG_PARAM1, param1)
//                putString(ARG_PARAM2, param2)
//            }
//        }
