package com.example.hw2

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkinViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    val imageView: ImageView
    val name: TextView

    init {
        imageView = itemView.findViewById(R.id.imageView)
        name = itemView.findViewById(R.id.name)
    }
}