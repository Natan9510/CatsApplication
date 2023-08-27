package com.example.catsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CatsData> catsDataList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CatAdapter catAdapter = new CatAdapter(new DiffCallBack());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setAdapter(catAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        catsDataList.add(new CatsData(R.drawable.img_0, "cat 1"));
        catsDataList.add(new CatsData(R.drawable.img_1, "cat 2"));
        catsDataList.add(new CatsData(R.drawable.img_2, "cat 3"));

        catAdapter.submitList(catsDataList);



    }

}