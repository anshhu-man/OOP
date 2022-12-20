package com.example.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val car = Car()
//        car.maxSpeed = 150
//        car.start()

//        val d = Driver("Tom",37)
//        d.showDetails()

        var myCar = MyCar()
        myCar.maxSpeed = 1500
        myCar.start()

    }
}