package com.example.myapplication

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class Model(
    val icon: Int,
    val title: String,
    val subtitle: String
)


class Adapter(private val context: Context,
              private val list: ArrayList<Model>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val iconIV: ImageView = view.findViewById(R.id.iconIV)
        val titleTV: TextView = view.findViewById(R.id.titleTV)
        val subtitleTV: TextView = view.findViewById(R.id.subtitleTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cell_view,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        //holder.iconIV.setImageDrawable(ContextCompat.getDrawable(context, data.icon))
        holder.titleTV.text = data.title
        holder.subtitleTV.text = data.subtitle
    }
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(this, fetchList())
    }

    private fun fetchList(): ArrayList<Model> {
        val list = arrayListOf<Model>()

        for (i in 0..9) {
            val model = Model(
                0,
                "Title : $i", "Subtitle : $i")
            list.add(model)
        }
        return list
    }
}