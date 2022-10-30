package com.example.gson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

data class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Timber.plant(Timber.DebugTree())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}