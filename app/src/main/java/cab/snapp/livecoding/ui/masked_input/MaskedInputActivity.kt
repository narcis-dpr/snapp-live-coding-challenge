package cab.snapp.livecoding.ui.masked_input

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cab.snapp.livecoding.R

class MaskedInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masked_input)

        // you should implement your code here
        // you should write a mask for your EditText which handles showing currencies like 34,000,000 Rls
        // you must only let user to enter numbers
    }
}