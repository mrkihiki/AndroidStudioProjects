package com.example.mydialer


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import timber.log.Timber
import timber.log.Timber.Forest.plant
import java.io.FileReader
import java.lang.reflect.Type
import java.net.URL


class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.btn_search)
        plant(Timber.DebugTree())
        button.setOnClickListener {
        data class Contact(var name: String, var phone: String, var type: String)


        val builder = GsonBuilder()
        val gson = builder.create()
            doAsync
            Thread {
                val jsonString =
                    URL("https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ff49fcd4d4a08aa6aafb6ea3de826464&tags=cat&format=json&nojsoncallback=1").readText()
            }.start()
        //val REVIEW_TYPE: Type = object : TypeToken<List<Contact?>?>() {}.type

            //val reader = JsonReader(FileReader("https://drive.google.com/u/0/uc?id=1-KO-9GA3NzSgIc1dkAsNm8Dqw0fuPxcR&export=download"))
       // val data: List<Contact> = gson.fromJson<List<Contact>>(reader, REVIEW_TYPE)
        //Timber.v(data)
    }
        // val reader = JsonReader(FileReader(applicationContext.assets
        //            .open("phones.json")
        //            .bufferedReader().use {
        //                it.readText()
        //            }))

        //val murzik: Contact = gson.fromJson(C:\Users\mrkih\Downloads\phones.json)
    }
}
