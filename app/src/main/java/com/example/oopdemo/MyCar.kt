package com.example.oopdemo

import android.util.Log

class MyCar : Car(), SpeedController {

    override fun start() {
        Log.i("MYTAG", "My car is starting... Brand ID is ${getBrandId()}")
    }

    override fun accelerate() {
        Log.i("MYTAG", "My car is accelerating")
    }

    override fun decelerate() {
        Log.i("MYTAG", "My car is decelerating")
    }

}