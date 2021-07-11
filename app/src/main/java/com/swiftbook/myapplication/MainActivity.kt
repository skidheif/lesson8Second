package com.swiftbook.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


fun View.show() {
    visibility = View.VISIBLE
}


class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "kotlin_lesson_15"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orders_list)
        Log.d(TAG, "onCreate: ${savedInstanceState?.getString("Hello")}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState: ")
        outState.putString("Hello","ASDASDASD")
    }

}