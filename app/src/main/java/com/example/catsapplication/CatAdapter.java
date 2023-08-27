package com.example.catsapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CatAdapter extends ListAdapter<CatsData, CatAdapter.CatViewHolder> {

    protected CatAdapter(@NonNull DiffUtil.ItemCallback<CatsData> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_item, parent, false);
        return new CatViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        CatsData catsData = getCurrentList().get(position);
        holder.catImage.setImageResource(catsData.imageResId);
        holder.catName.setText(catsData.name);
    }

    public class CatViewHolder extends RecyclerView.ViewHolder {

        public ImageView catImage;
        public TextView catName;

        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            catImage = itemView.findViewById(R.id.cat_image);
            catName = itemView.findViewById(R.id.cat_text);
        }
    }
}
