package com.example.mydigital.Models;

public class Dessert {
    private String name;
    protected int image;

    public Dessert(String name,int image) {
        this.name = name;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
