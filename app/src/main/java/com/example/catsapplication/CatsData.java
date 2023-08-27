package com.example.catsapplication;

public class CatsData {
    int id;
    int imageResId;
    String name;

    public CatsData(int imageResIs, String name) {
        this.imageResId = imageResIs;
        this.name = name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
