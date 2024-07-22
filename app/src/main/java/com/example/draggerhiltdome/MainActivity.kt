package com.example.draggerhiltdome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.draggerhiltdome.di.Car
import com.example.draggerhiltdome.di.Car1
import com.example.draggerhiltdome.di.LName
import com.example.draggerhiltdome.di.MainOne
import com.example.draggerhiltdome.di.TestQualifier
import com.example.draggerhiltdome.di.main2
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint// this annotation  is use to create the object of the MyApp class so that we can access all the depensencies in this class
class MainActivity : AppCompatActivity() {
    @Inject // by this annotation we create the instance of class which we want in this activity
    lateinit var car: Car // this  is called the field injection

    @Inject
    lateinit var car1: Car1 // in this we are calling car3 class by car1 constructor injection

    @Inject
    lateinit var mainOne: MainOne

    @Inject
    lateinit var main2: main2

    @Inject
    lateinit var testQualifier: TestQualifier
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        car.getCar()
        car1.getCar1()
        mainOne.demoOne()
        main2.main2()
        testQualifier.getNames()
    }


    // to pass the data Qualifier at run time

    companion object{
        val FName="vaibhav"
        val LName="Shitole"
    }
}