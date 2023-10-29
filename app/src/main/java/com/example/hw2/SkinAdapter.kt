package com.example.hw2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SkinAdapter(private val context: Context, private val foods: List<Skin>) : RecyclerView.Adapter<SkinViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkinViewHolder {
        return SkinViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: SkinViewHolder, position: Int) {
        holder.imageView.setImageResource(foods[position].image)
        holder.name.text = foods[position].name
    }

    override fun getItemCount(): Int {
        return foods.size
    }

}