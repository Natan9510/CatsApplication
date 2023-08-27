package com.example.catsapplication;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class DiffCallBack extends DiffUtil.ItemCallback<CatsData> {
    @Override
    public boolean areItemsTheSame(@NonNull CatsData oldItem, @NonNull CatsData newItem) {
        return oldItem.id == newItem.id;
    }

    @Override
    public boolean areContentsTheSame(@NonNull CatsData oldItem, @NonNull CatsData newItem) {
        return oldItem.imageResId == newItem.imageResId || newItem.name.equals(oldItem.name);
    }
}
