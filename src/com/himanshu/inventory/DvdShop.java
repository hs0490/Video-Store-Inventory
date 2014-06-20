package com.himanshu.inventory;

import java.io.IOException;

/**
 * Created by hs0490 on 4/15/14.
 */
public interface DvdShop  {

    void addMovie(String movieName, double moviePrice) throws IOException;

    void changePrice(String movieName, double price) throws IOException;

    void addCopies(String movieName, int newQuantity) throws IOException;

    void sellMovie(String movieName) throws IOException;

    double getMoviePrice(String movieName);

    int getMovieQuantity(String movieName);
}
