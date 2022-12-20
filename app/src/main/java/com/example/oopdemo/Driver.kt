package com.example.oopdemo

import android.util.Log

class Driver(var name : String, credit :Int) {
//    var driverName = ""
//    lateinit var driverName :String

    private var totalCredit = 50
    private var car = Car()

    init{
//        driverName = name
        totalCredit += credit
        car.maxSpeed = 150
        car.start()
    }
    fun showDetails() {
        Log.i("MyTag","name of the driver is $name with $totalCredit credits")
    }
}
