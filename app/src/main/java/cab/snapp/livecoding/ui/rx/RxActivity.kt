package cab.snapp.livecoding.ui.rx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cab.snapp.livecoding.databinding.ActivityRxBinding

class RxActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityRxBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)


        // implement your codes here
        // you should get your data from "RideDataManager" class
        // you get both "rides" and "discounts" data and show them to the user
        // use a simple Text as a List which each item is separated by \n
        //note 1: you should wait for both "rides" and "discounts" , then you can show them to the user
        //note 2: you should find the discount of your ride by yourself in "discounts" data and show the ride like: "Ride id: xxx, Discount: yyy"
        //note 3: each ride may have no discount so you should display it like: "Ride Id: xxx
    }

}