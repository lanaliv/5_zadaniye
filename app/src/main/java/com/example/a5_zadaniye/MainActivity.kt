package com.example.a5_zadaniye

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Снежная замять крутит бойко,(Bundle?) called")
        setContentView(R.layout.activity_main)

        override fun onStart() {
            super.onStart()
            Log.d(TAG, "По полю мчится чужая тройка.() called")
        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG, "Мчится на тройке чужая младость.() called")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "Где мое счастье? Где моя радость?() called")
        }

        override  fun onStop() {
            super.onStop()
            Log.d(TAG, "Все укатилось под вихрем бойким() called")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "Вот на такой же бешеной тройке.() called")
        }


}