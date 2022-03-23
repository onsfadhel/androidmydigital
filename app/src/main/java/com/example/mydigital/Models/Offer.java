package com.example.mydigital.Models;

public class Offer {
    private String name,offer;
    private int image;

    public Offer(String name,String offer,int image) {
        this.name = name;
        this.offer=offer;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
