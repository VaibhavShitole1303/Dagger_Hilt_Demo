package com.example.draggerhiltdome.di

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor() {  //with @Inject we create the object of this class
    fun getCar(){
        Log.d("MAIN====car is running","MAIN====car is running")
//        print("MAIN====car is running")
    }
}

class Car1 @Inject constructor(val car3: Car3) {  //this is called constructor dependency injection
    fun getCar1(){
        car3.getCar3()
        Log.d("MAIN====car is running","MAIN====car1 is running")
//        print("MAIN====car is running")
    }
}


class Car3 @Inject constructor() {  //with @Inject we create the object of this class
    fun getCar3(){
        Log.d("MAIN====car is running","MAIN====car3 is running")
//        print("MAIN====car is running")
    }
}