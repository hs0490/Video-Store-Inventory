package com.himanshu.commands;


import com.himanshu.inventory.Inventory;

/**
 * Created by hs0490 on 4/5/14.
 */
public class SellMovieCommand implements Command {

    String movieName;

    public SellMovieCommand(String movieName){
        this.movieName = movieName;
    }

    @Override
    public void execute(Inventory aInventory) {
        aInventory.sellMovie(movieName);
    }

}
