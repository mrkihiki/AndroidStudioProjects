package com.example.recyclerview

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



data class ColorData(val colorName:String, val colorHex: Int)

interface CellClickListener {
    fun onCellClickListener(date:ColorData)
}


class Adapter(private val context: Context,
              private val list: ArrayList<ColorData>,
              private val cellClickListener: CellClickListener) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val iconIV: View = view.findViewById(R.id.view)
        val titleTV: TextView = view.findViewById(R.id.textView)
        //val subtitleTV: TextView = view.findViewById(R.id.subtitleTV)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rview_item,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = list[position]
        holder.iconIV.setBackgroundColor(data.colorHex)
        holder.titleTV.text = data.colorName
        //        setBackgroundColor
        //holder.subtitleTV.text = data.subtitle
        holder.iconIV.setOnClickListener {
            cellClickListener.onCellClickListener(data)
        }
    }
}



class MainActivity : AppCompatActivity(), CellClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.rView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(this, fetchList(),this)
    }

    private fun fetchList(): ArrayList<ColorData> {
        val list = arrayListOf<ColorData>()

            var model = ColorData(
                "BLACK",
                Color.BLACK)
        list.add(model)

        model = ColorData(
            "WHITE",
            Color.WHITE)

        list.add(model)
        model = ColorData(
            "YELLOW",
            Color.YELLOW)
        list.add(model)
        model = ColorData(
            "BLUE",
            Color.BLUE)
        list.add(model)
        val model1 = ColorData(
            "CYAN",
            Color.CYAN)

        list.add(model1)






/*
        for (i in 0..9) {
            val model = ColorData(
                "colorName : $i",i)
            list.add(model)
        }

*/
        return list
    }

    override fun onCellClickListener(data: ColorData) {
        Toast.makeText(this,data.colorName, Toast.LENGTH_SHORT).show()
    }
}
