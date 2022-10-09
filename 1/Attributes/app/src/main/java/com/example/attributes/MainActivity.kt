package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText: EditText =findViewById(R.id.editText)
        val button1: Button =findViewById(R.id.button1)
        button1.setOnClickListener{
            editText.setTextColor(Color.BLACK)
        }
        val button2: Button =findViewById(R.id.button2)
        button2.setOnClickListener{
            editText.setTextColor(Color.RED)
        }
        val button3: Button =findViewById(R.id.button3)
        button3.setOnClickListener{
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP,8f)
        }
        val button4: Button =findViewById(R.id.button4)
        button4.setOnClickListener{
            editText.setTextSize(TypedValue.COMPLEX_UNIT_SP,24f)
        }
        val button5: Button =findViewById(R.id.button5)
        button5.setOnClickListener{
            editText.setBackgroundColor(Color.WHITE)
        }
        val button6: Button =findViewById(R.id.button6)
        button6.setOnClickListener{
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}