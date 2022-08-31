package com.example.doglerrsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class dogAdapter(private val item : ArrayList<String>) : RecyclerView.Adapter<dogViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): dogViewHolder {

        return dogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))
    }

    override fun onBindViewHolder(holder: dogViewHolder, position: Int) {
        val current_item = item[position]
        holder.item_text.text=current_item

    }
    override fun getItemCount(): Int {
        return item.size
    }
}

class dogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    val item_text : TextView = itemView.findViewById(R.id.item_title)

}