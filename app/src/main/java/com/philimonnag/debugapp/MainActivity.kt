package com.philimonnag.debugapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private  const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        //division()
      first()
    }
}
fun logging(){
    Log.i(TAG,"Thank You Jesus above All")
    Log.v(TAG,"This is verbose message")
    Log.e(TAG,"This is a error")
    Log.d(TAG,"This is a Debug message ")
    Log.i(TAG,"This is a info message")
    Log.w(TAG, "This is a warning")
}
fun division(){
    val numerator=60
    var denominator=4
    repeat(5){
        Log.v(TAG,"${numerator/denominator}")
        denominator--
    }
}

fun first() {
    second()
    Log.v(TAG, "1")
}

fun second() {
    third()
    Log.v(TAG, "2")
    fourth()
}

fun third() {
    Log.v(TAG, "3")
}

fun fourth() {
    Log.v(TAG, "4")
}