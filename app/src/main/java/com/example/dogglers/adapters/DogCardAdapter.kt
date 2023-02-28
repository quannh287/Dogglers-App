package com.example.dogglers.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.Dog

class DogCardAdapter(private val context: Context, private val dataset: List<Dog>) :
    RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    class DogCardViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val itemText: TextView = view.findViewById(R.id.horizontal_item_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_horizontal_item, parent, false)
        return DogCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item = dataset[position]
        holder.itemText.text = context.resources.getString(item.dogName)
    }
}
