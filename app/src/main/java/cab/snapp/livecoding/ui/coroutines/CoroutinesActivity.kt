package cab.snapp.livecoding.ui.coroutines

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cab.snapp.livecoding.databinding.ActivityReactiveBinding

class CoroutinesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityReactiveBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)


        // implement your codes here
        // use Coroutines and kotlin Flow and probably their operators to implement your logic
        // you should get your data from "RideDataManager" class
        // you get both "rides" and "discounts" data and show them to the user
        // use a simple Text as a List which each item is separated by \n
        //note 1: you should wait for both "rides" and "discounts" , then you can show them to the user
        //note 2: you should find the discount of your ride by yourself in "discounts" data and show the ride like: "Ride id: xxx, Discount: yyy"
        //note 3: each ride may have no discount so you should display it like: "Ride Id: xxx
        //note 4: please do this task one time with getting whole data completely and one time with getting data item by item
    }

}