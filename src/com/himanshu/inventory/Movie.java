package com.himanshu.inventory;

import java.io.Serializable;

/**
 * Created by hs0490 on 4/2/14.
 */
public class Movie implements Serializable {

    String name;
    int uniqueId;
    double price;
    int quantity;

    Movie(String name, int uniqueId, double price){
        this.name = name;
        this.uniqueId = uniqueId;
        this.price = price;
        this.quantity = 1;
    }



}
