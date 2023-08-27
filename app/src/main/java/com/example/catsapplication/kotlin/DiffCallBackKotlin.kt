package com.example.catsapplication.kotlin

import androidx.recyclerview.widget.DiffUtil

class DiffCallBackKotlin: DiffUtil.ItemCallback<CatsDataKotlin>() {
    override fun areItemsTheSame(oldItem: CatsDataKotlin, newItem: CatsDataKotlin): Boolean {
        return oldItem.imageResId == newItem.imageResId
    }

    override fun areContentsTheSame(oldItem: CatsDataKotlin, newItem: CatsDataKotlin): Boolean {
        return oldItem == newItem // само зрівняє всі змінні між собою
    }

}