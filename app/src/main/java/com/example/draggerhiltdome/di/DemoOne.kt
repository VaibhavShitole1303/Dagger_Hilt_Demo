package com.example.draggerhiltdome.di

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton


// interface DI with @module annotation
interface DemoOne {
 fun demoOne()
}

class DemoImplementationOne @Inject constructor():DemoOne{
    override fun demoOne() {
        Log.d("DemoImplementationOne","DemoImplementationOne  call ")
    }

}

class MainOne @Inject constructor(private  val demoOne: DemoOne){
    fun demoOne(){
        demoOne.demoOne()
    }
}


@Module
@InstallIn(SingletonComponent::class)
abstract class  AppModule2(){
    @Binds
    @Singleton
    abstract fun provideOne(
        demoImplementationOne: DemoImplementationOne
    ):DemoOne
}