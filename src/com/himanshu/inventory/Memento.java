package com.himanshu.inventory;

import java.io.Serializable;

/**
 * Created by hs0490 on 4/2/14.
 */
public class Memento implements Serializable {
    private Inventory aInventory;

    Memento(Inventory aInventory){
        this.aInventory = aInventory;
    }


    Inventory getInventory(){

        return aInventory;
    }

}
