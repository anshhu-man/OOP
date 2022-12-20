package com.example.oopdemo

import android.util.Log

class MyCar : Car(),SpeedController{
    override fun start(){
        Log.i("MyTag","This is my Car starting...Vroom Vroom. BrandID is ${getBrandID()}")
    }

    override fun accelerate() {
    }

    override fun decelerate() {
    }
}