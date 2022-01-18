package cab.snapp.livecoding.ui.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cab.snapp.livecoding.R

class ServicesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.services_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ServicesFragment.newInstance())
                .commitNow()
        }
    }
}