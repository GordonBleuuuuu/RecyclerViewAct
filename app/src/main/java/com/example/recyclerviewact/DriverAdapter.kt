package com.example.f1drivers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewact.R

class DriverAdapter(private val drivers: List<Driver>) :
    RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {

    class DriverViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val teamTextView: TextView = itemView.findViewById(R.id.teamTextView)
        val driverImageView: ImageView = itemView.findViewById(R.id.driverImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.driver_item, parent, false)
        return DriverViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val currentDriver = drivers[position]
        holder.nameTextView.text = currentDriver.name
        holder.teamTextView.text = currentDriver.team
        holder.driverImageView.setImageResource(currentDriver.imageResId)
    }

    override fun getItemCount() = drivers.size
}