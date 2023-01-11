package com.example.oopdemo

import android.util.Log

open class Car {

    var maxSpeed = 30

    open fun start() {
        Log.i("MYTAG", "Car is starting")
        Log.i("MYTAG", "Maximum speed is $maxSpeed")
    }
}