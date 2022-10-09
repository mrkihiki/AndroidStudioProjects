package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.EditText
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val ch: CheckBox =findViewById(R.id.checkBox)
            val editText:EditText=findViewById(R.id.editText)
            val textView:TextView=findViewById(R.id.textView)
            val pb:ProgressBar=findViewById(R.id.progressBar)
            if(ch.isChecked){
                var b="  ,  "
                if(textView.text.toString()==""){b=""}

                textView.text=textView.text.toString()+b+editText.getText().toString()
                pb.setProgress(pb.getProgress()+10)

            }

        }

    }
}