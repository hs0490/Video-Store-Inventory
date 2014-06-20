package com.himanshu.client;


import com.himanshu.inventory.Inventory;
import com.himanshu.inventory.InventoryDecorator;

import java.io.File;
import java.io.IOException;

/**
 * Created by hs0490 on 4/5/14.
 */
public class InventoryClient {


    public static void main(String args[]) throws IOException, ClassNotFoundException {

        Inventory aInventory;


       // to reset Inventory
       File aFile = new File("inventory.ser");
        if(aFile.exists())
            aInventory = RestoreInventory.restoreInventory();
        else
            aInventory = new Inventory();


        InventoryDecorator aDecorator = new InventoryDecorator(aInventory);

        aDecorator.addMovie("Robocop",12.24);

        aDecorator.addMovie("Terminator",10.00);

        aDecorator.changePrice("Robocop",11.34);

        aDecorator.addCopies("Terminator", 3);

        aDecorator.sellMovie("Robocop");

        aDecorator.sellMovie("Terminator");

        aDecorator.addMovie("Jaws",12.24);

        aDecorator.addMovie("Independence",10.00);
    }
}
