package com.himanshu.inventory;

import com.himanshu.commands.*;

import java.io.IOException;

/**
 * Created by hs0490 on 4/15/14.
 */
public class InventoryDecorator implements DvdShop{

    Inventory aInventory;
    CommandInvoker invoker;

    public InventoryDecorator(Inventory aInventory) throws IOException {
        this.aInventory = aInventory;
        invoker = new CommandInvoker(aInventory);
    }

    @Override
    public void addMovie(String movieName, double moviePrice) throws IOException {
        AddMovieCommand addCommand = new AddMovieCommand(movieName,moviePrice);
        invoker.runCommand(addCommand);
        invoker.saveCommand(addCommand);
    }

    @Override
    public void changePrice(String movieName, double price) throws IOException {
        ChangePriceCommand changeCommand = new ChangePriceCommand(movieName,price);
        invoker.runCommand(changeCommand);
        invoker.saveCommand(changeCommand);
    }

    @Override
    public void addCopies(String movieName, int newQuantity) throws IOException {
        AddCopiesCommand copiesCommand = new AddCopiesCommand(movieName,newQuantity);
        invoker.runCommand(copiesCommand);
        invoker.saveCommand(copiesCommand);
    }

    @Override
    public void sellMovie(String movieName) throws IOException {
        SellMovieCommand sellCommand = new SellMovieCommand(movieName);
        invoker.runCommand(sellCommand);
        invoker.saveCommand(sellCommand);
    }

    @Override
    public double getMoviePrice(String movieName) {
        return aInventory.getMoviePrice(movieName);
    }

    @Override
    public int getMovieQuantity(String movieName) {
        return aInventory.getMovieQuantity(movieName);
    }
}
