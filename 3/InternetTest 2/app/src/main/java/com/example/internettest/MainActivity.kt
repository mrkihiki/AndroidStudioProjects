package com.example.internettest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.net.HttpURLConnection
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button: Button =findViewById(R.id.btnHTTP)
        button.setOnClickListener{
            Thread(Runnable{
                val url = URL("https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ff49fcd4d4a08aa6aafb6ea3de826464&tags=cat&format=json&nojsoncallback=1")
            val connection = url.openConnection() as HttpURLConnection
            try {
                val data = connection.inputStream.bufferedReader().readText()
                Log.d("Flickr cats", data)
            } finally {
                connection.disconnect()
            }
        }).start()

        }
        val button2: Button =findViewById(R.id.btnOkHTTP)
        button2.setOnClickListener{
            val client = OkHttpClient()

            fun run() {
                Thread(Runnable{
                val request = Request.Builder()
                    .url("https://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ff49fcd4d4a08aa6aafb6ea3de826464&tags=cat&format=json&nojsoncallback=1")
                    .build()
                    client.newCall(request).execute().use { response ->
                    Log.i("Flickr OkCats", (response.body!!.string()))
                }
                }).start()
                /*
                    for ((name, value) in response.headers) {
                        println("$name: $value")
                    }
*/
                    //Log.i("Flickr OkCats",(response.body!!.string()))
                }
            run()
            }
        }
    }
