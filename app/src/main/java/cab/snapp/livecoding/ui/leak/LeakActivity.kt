package cab.snapp.livecoding.ui.leak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cab.snapp.livecoding.R

class LeakActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.leak_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LeakFragment.newInstance())
                .commitNow()
        }
    }
}