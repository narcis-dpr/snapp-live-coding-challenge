package cab.snapp.livecoding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cab.snapp.livecoding.databinding.ActivityMainBinding
import cab.snapp.livecoding.ui.leak.LeakActivity
import cab.snapp.livecoding.ui.masked_input.MaskedInputActivity
import cab.snapp.livecoding.ui.rx.RxActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

        binding.leakActivityBtn.setOnClickListener {
            startActivity(Intent(this, LeakActivity::class.java))
        }

        binding.maskedInputBtn.setOnClickListener {
            startActivity(Intent(this, MaskedInputActivity::class.java))
        }

        binding.rxJavaBtn.setOnClickListener {
            startActivity(Intent(this, RxActivity::class.java))
        }
    }
}