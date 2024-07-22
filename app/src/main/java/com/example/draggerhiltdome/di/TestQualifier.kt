package com.example.draggerhiltdome.di

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.draggerhiltdome.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier



// Qualifier are use when we have same return type functions in model class
//if we not use this dagger give compile time error because it does not differentiate between them
//qualifier  gives different tag to the function who have same return type



// dagger -hilt have by default two qualifier ActivityContext and ApplicationContext
class TestQualifier @Inject constructor(
    @FName  //this is our qualifier for the fName function
    val  fName:String ,
    @LName//this is our qualifier for the lName function
    val lName: String,
    @ActivityContext  // this is by default qualifier if th dagger to get the context of activity in which this class s used
     val context: Context
) {
    fun getNames(){
        Log.d("Test Qualified","$fName  $lName")
        Toast.makeText(context,"Hello",Toast.LENGTH_LONG).show()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object Modules{
     // below two function are retuning the String & as we know string is a Predefine Class
    //so we have to use qualifier
    @Provides
    @FName  // providing the qualifier for fName function
//    fun provideFName() ="Vaibhav"  // static data
    fun provideFName() =MainActivity.FName  // dynamic data
    @Provides
    @LName   // providing the qualifier for lName function
//    fun provideLName()="Shitole"
    fun provideLName()=MainActivity.LName

}


// creating the qualifier for FName
@Qualifier
@Retention(AnnotationRetention.BINARY)// this annotation is use to create a tag
annotation class FName()    // we define this with annotation class

// creating the qualifier for lName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class  LName()