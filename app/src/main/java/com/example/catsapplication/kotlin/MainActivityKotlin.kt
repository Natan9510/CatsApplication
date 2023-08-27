package com.example.catsapplication.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.catsapplication.R

class MainActivityKotlin: AppCompatActivity() {

    lateinit var recyclerViewKotlin: RecyclerView
    var diffCallBackKotlin: DiffCallBackKotlin = DiffCallBackKotlin()
    var catAdapterKotlin: CatAdapterKotlin = CatAdapterKotlin(diffCallBackKotlin)

    var list: ArrayList<CatsDataKotlin> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewKotlin = findViewById(R.id.recyclerview)
        recyclerViewKotlin.layoutManager = LinearLayoutManager(this)
        recyclerViewKotlin.adapter = catAdapterKotlin

        list.add(CatsDataKotlin(R.drawable.img_0, "kitty 1"))
        list.add(CatsDataKotlin(R.drawable.img_1, "kitty 2"))
        list.add(CatsDataKotlin(R.drawable.img_2, "kitty 3"))

        catAdapterKotlin.submitList(list)


    }
}
