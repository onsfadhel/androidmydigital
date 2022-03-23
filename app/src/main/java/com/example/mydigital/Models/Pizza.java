package com.example.mydigital.Models;

public class Pizza {
    private String name , namerestaurant;
    private String hour;
    private int image;
    private float price;

    public Pizza(String name,String hour,int image,float price,String namerestaurant) {
        this.name = name;
        this.hour=hour;
        this.image=image;
        this.price=price;
        this.namerestaurant=namerestaurant;
    }

    public String getNamerestaurant() {
        return namerestaurant;
    }

    public void setNamerestaurant(String namerestaurant) {
        this.namerestaurant = namerestaurant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
