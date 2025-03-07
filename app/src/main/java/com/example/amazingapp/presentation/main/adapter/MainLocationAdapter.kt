package com.example.amazingapp.presentation.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazingapp.R
import com.example.amazingapp.domain.LocationModel
import com.example.amazingapp.utils.loadImage

class MainLocationAdapter(private var locationList: List<LocationModel>) : RecyclerView.Adapter<MainLocationHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainLocationHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_location, parent, false)
        return MainLocationHolder(itemView)
    }

    override fun getItemCount(): Int = locationList.size

    override fun onBindViewHolder(holder: MainLocationHolder, position: Int) {
        val location = locationList[position]
        holder.name.text = location.name
        holder.description.text = location.description
        holder.image.loadImage(location.imageUrl, radius = 8)

    }


    fun updateData(newAppList: List<LocationModel>) {
        locationList = newAppList.toList()
        notifyDataSetChanged()
    }

}

class MainLocationHolder(itemView: View) : RecyclerView.ViewHolder(itemView.rootView) {
    val name: TextView = itemView.findViewById(R.id.locationName)
    val description: TextView = itemView.findViewById(R.id.locationDescription)
    val image: ImageView = itemView.findViewById(R.id.locationImage)
}