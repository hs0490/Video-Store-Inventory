package com.himanshu.commands;

import com.himanshu.inventory.Inventory;

import java.io.IOException;

/**
 * Created by hs0490 on 4/5/14.
 */
public class AddMovieCommand implements Command {

    String movieName;
    double price;

    public AddMovieCommand(String movieName,double price){
        this.movieName = movieName;
        this.price = price;
    }

    @Override
    public void execute(Inventory aInventory) throws IOException {
        aInventory.addMovie(movieName,price);
    }

}
