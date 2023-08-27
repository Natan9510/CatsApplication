package com.example.catsapplication.kotlin


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.catsapplication.R

class CatAdapterKotlin(diffCallBack: DiffUtil.ItemCallback<CatsDataKotlin>):
    ListAdapter<CatsDataKotlin, CatViewHolderKotlin>(diffCallBack) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolderKotlin {
        var itemView: View = LayoutInflater.from(parent.context).inflate(
            R.layout.cat_item, parent, false)
        return CatViewHolderKotlin(itemView)
    }

    override fun onBindViewHolder(holder: CatViewHolderKotlin, position: Int) {
        var catsDataKotlin: CatsDataKotlin = currentList.get(position)
        holder.catImage.setImageResource(catsDataKotlin.imageResId)
        holder.catName.setText(catsDataKotlin.name)
    }
}

class CatViewHolderKotlin(var itemView: View): RecyclerView.ViewHolder(itemView) {
    val catImage: ImageView = itemView.findViewById(R.id.cat_image)
    val catName: TextView = itemView.findViewById(R.id.cat_text)
}
