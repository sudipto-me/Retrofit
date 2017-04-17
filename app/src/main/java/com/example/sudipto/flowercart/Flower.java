package com.example.sudipto.flowercart;

import java.util.List;

/**
 * Created by sudipto on 4/17/2017.
 */

public class Flower {


    public String price;
    public String photo;
    public String name;


    public Flower(String price,  String photo, String name) {
        super();
        this.price = price;

        this.photo = photo;
        this.name = name;

    }



    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}