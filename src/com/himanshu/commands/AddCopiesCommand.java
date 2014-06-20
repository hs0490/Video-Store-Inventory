package com.himanshu.commands;


import com.himanshu.inventory.Inventory;

/**
 * Created by hs0490 on 4/5/14.
 */
public class AddCopiesCommand implements Command {

    String movieName;
    int quantity;

    public AddCopiesCommand(String movieName, int quantity){
        this.movieName = movieName;
        this.quantity = quantity;
    }

    @Override
    public void execute(Inventory aInventory) {
        aInventory.addCopies(movieName,quantity);
    }

}
