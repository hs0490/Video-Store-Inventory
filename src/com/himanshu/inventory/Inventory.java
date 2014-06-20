package com.himanshu.inventory;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Created by hs0490 on 4/2/14.
 */
public class Inventory implements Serializable, DvdShop {

    private Hashtable<String,Movie> movieTable = new Hashtable<String,Movie>();
    transient private int uniqueId;


    /**
     * This function add Movies in the Inventory
     * @param movieName  - The new movie name.
     * @param moviePrice - The new movie price.
     */
    public void addMovie(String movieName, double moviePrice){
        if(movieTable.containsKey(movieName)){
            Movie aMovie = movieTable.get(movieName);
            int oldQuantity = aMovie.quantity;
            aMovie.quantity= ++oldQuantity;
            aMovie.price = moviePrice;
            System.out.println("Movie already exists in Inventory");
            System.out.println("Number of quantity"+oldQuantity);
            System.out.println("----------Movie added-------------");
        }
        else{
            movieTable.put(movieName, new Movie(movieName, ++uniqueId, moviePrice));
            System.out.println("Movie: "+movieName+" Added In Inventory");
            System.out.println("----------Movie added-------------");
        }
    }

    /**
     * This function changes the price of the movie.
     * @param movieName - - The name of the movie.
     * @param price - The new price of the movie.
     */
    public void changePrice(String movieName, double price){
        Movie aMovie = movieTable.get(movieName);
        aMovie.price = price;
    }

    /**
     * This function adds the copies of the movie
     * @param movieName - The name of the movie.
     * @param newQuantity  - Number of Copies to be added.
     */
    public void addCopies(String movieName, int newQuantity){
        Movie aMovie = movieTable.get(movieName);
        aMovie.quantity = aMovie.quantity + newQuantity;
    }

    /**
     * This function removes one copy of the movie from the inventory.
     * @param movieName - The name of the movie.
     */
    public void sellMovie(String movieName){
        Movie aMovie = movieTable.get(movieName);
        int newQuantity = aMovie.quantity - 1;
        aMovie.quantity = newQuantity;
        System.out.println("New Quantity "+newQuantity);
    }

    /**
     * This function returns the price of the movie.
     * @param movieName - The name of the movie.
     * @return double
     */
    public double getMoviePrice(String movieName){
        Movie aMovie = movieTable.get(movieName);
        return aMovie.price;
    }

    /**
     * This function returns the number of copies in the movie
     * @param movieName - The name of the movie.
     * @return int
     */
    public int getMovieQuantity(String movieName){
        Movie aMovie = movieTable.get(movieName);
        return aMovie.quantity;
    }


}

