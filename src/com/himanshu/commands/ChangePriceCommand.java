package com.himanshu.commands;


import com.himanshu.inventory.Inventory;

/**
 * Created by hs0490 on 4/5/14.
 */
public class ChangePriceCommand implements Command {

    String movieName;
    double newPrice;

    public ChangePriceCommand(String movieName, double newPrice){
        this.movieName = movieName;
        this.newPrice = newPrice;
    }

    @Override
    public void execute(Inventory aInventory) {
        aInventory.changePrice(movieName,newPrice);
    }

}
