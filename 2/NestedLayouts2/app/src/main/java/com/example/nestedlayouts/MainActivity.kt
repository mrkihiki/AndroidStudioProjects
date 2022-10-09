package com.example.nestedlayouts

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        var i:Int
        i=1
        var q=2
        button.setOnClickListener {
            val textView1_1:TextView=findViewById(R.id.textView1_1)
            val textView1_2:TextView=findViewById(R.id.textView1_2)
            val textView1_3:TextView=findViewById(R.id.textView1_3)
            val textView2_1:TextView=findViewById(R.id.textView2_1)
            val textView2_2:TextView=findViewById(R.id.textView2_2)
            val textView2_3:TextView=findViewById(R.id.textView2_3)
            val textView3_1:TextView=findViewById(R.id.textView3_1)
            val textView3_2:TextView=findViewById(R.id.textView3_2)
            val textView3_3:TextView=findViewById(R.id.textView3_3)
            if(i==1){
                textView1_1.text=""
                textView2_1.text=""
                textView3_1.text=""
                textView1_2.text=q.toString()
                textView2_2.text=q.toString()
                textView3_2.text=q.toString()
                q++
                i=2
            }else if(i==2){
                textView1_2.text=""
                textView2_2.text=""
                textView3_2.text=""
                textView1_3.text=q.toString()
                textView2_3.text=q.toString()
                textView3_3.text=q.toString()
                q++
                i=3
            }else{
                textView1_3.text=""
                textView2_3.text=""
                textView3_3.text=""
                textView1_1.text=q.toString()
                textView2_1.text=q.toString()
                textView3_1.text=q.toString()
                q++
                i=1

            }

        }

    }
}