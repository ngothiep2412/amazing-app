package com.example.amazingapp.presentation.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.amazingapp.R
import com.example.amazingapp.domain.NewModel
import com.example.amazingapp.utils.loadImage

class MainNewsAdapter(private var newList: List<NewModel>) :
    RecyclerView.Adapter<MainNewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainNewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_new, parent, false)
        return MainNewHolder(itemView)
    }

    override fun getItemCount(): Int = newList.size

    override fun onBindViewHolder(holder: MainNewHolder, position: Int) {
        val new = newList[position]

        holder.title.text = new.title
        holder.description.text = new.description
//        holder.date.text = new.publishedDate
        holder.image.loadImage(new.imageUrl, radius = 8)
    }


    fun updateData(newAppList: List<NewModel>) {
        newList = newAppList
        notifyDataSetChanged()
    }

}

class MainNewHolder(itemView: View) : RecyclerView.ViewHolder(itemView.rootView) {
    val title: TextView = itemView.findViewById(R.id.newsTitle)
    val description: TextView = itemView.findViewById(R.id.newsDescription)
    val image: ImageView = itemView.findViewById(R.id.newsImage)
//    val date: TextView = itemView.findViewById(R.id.newsDate)
}