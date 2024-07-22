package com.example.draggerhiltdome.di

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton


// interface annotation with @provides annotation
interface Demo2 {

    fun demo2()
}

class  Demo2Implementation @Inject constructor():Demo2{
    override fun demo2() {
        Log.d("Demo2Implementation","Demo2Implementation calling ")
    }
}

class  main2 @Inject constructor(private val demo2: Demo2){

    fun main2(){
        demo2.demo2()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object AppModules{
    @Provides
    @Singleton
    fun provideDemo2():Demo2= Demo2Implementation()
}