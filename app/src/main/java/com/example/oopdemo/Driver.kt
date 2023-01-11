package com.example.oopdemo

import android.util.Log

class Driver(var name: String, credits: Int) {

    private var totalCredits = 50
    private val car = Car()

    init {
        totalCredits += credits
        car.maxSpeed = 150
        car.start()
    }

    fun showDetails() {
//        Log.i("MYTAG", "Name of the driver is $driverName")
        Log.i("MYTAG", "Name of the driver is $name with $totalCredits credits")
    }
}