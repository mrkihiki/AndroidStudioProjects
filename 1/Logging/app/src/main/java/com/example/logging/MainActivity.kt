package com.example.logging

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button_log)
        Timber.plant(Timber.DebugTree())
        button.setOnClickListener {
            val editText:EditText=findViewById(R.id.editText)
            Log.v("From EditText", editText.getText().toString())
        }
        val button1:Button=findViewById(R.id.button_timber)
        button1.setOnClickListener{
            val editText:EditText=findViewById(R.id.editText)
            Timber.v(editText.getText().toString())
        }

    }
}