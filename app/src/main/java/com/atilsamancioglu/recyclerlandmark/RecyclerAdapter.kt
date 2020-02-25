package com.atilsamancioglu.recyclerlandmark

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RecyclerAdapter(val landmarkList: ArrayList<String>, val landmarkImageList : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.LandmarkHolder>() {

    class LandmarkHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return LandmarkHolder(layoutInflater)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.itemView.item_text.text = landmarkList[position]
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,DetailActivity::class.java)
            intent.putExtra("name",landmarkList[position])
            holder.itemView.context.startActivity(intent)
            val singleton = SingletonClass.Selected
            singleton.selectedImage = landmarkImageList[position]
        }
    }
}