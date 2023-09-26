package com.example.learning.ui.skill

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.learning.R
import com.google.android.material.imageview.ShapeableImageView

class SkillAdapter(private val skillList : ArrayList<skill>) : RecyclerView.Adapter<SkillAdapter.SkillViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkillViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_skill , parent , false)

        return SkillViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return skillList.size
    }

    override fun onBindViewHolder(holder: SkillViewHolder, position: Int) {
        val currentItem = skillList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.skillHeading.text = currentItem.heading
    }

    class  SkillViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val skillHeading : TextView = itemView.findViewById(R.id.skillHeading)
    }

}