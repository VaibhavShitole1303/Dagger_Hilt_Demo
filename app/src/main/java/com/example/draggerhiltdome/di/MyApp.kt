package com.example.draggerhiltdome.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp // by this we indicate that is the parent class that implement the Application class and this class have the all dependency in it
class MyApp:Application() {

}