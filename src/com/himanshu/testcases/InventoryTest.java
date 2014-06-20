package com.himanshu.testcases;


import com.himanshu.inventory.Inventory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by hs0490 on 4/2/14.
 */
public class InventoryTest {
    @Test
    public void testAddMovie() throws Exception {
        Inventory aInventory = new Inventory();
        aInventory.addMovie("Robocop",12.24);
        aInventory.addMovie("Terminator",10.00);
        assertEquals(1,aInventory.getMovieQuantity("Robocop"));
        assertEquals(1,aInventory.getMovieQuantity("Terminator"));

    }

    @Test
    public void testChangePrice() throws Exception {
        Inventory aInventory = new Inventory();
        aInventory.addMovie("Robocop",12.24);
        aInventory.changePrice("Robocop",11.34);
        assertEquals(11.34,aInventory.getMoviePrice("Robocop"),2.0);

    }

    @Test
    public void testAddCopies() throws Exception {
        Inventory aInventory = new Inventory();
        aInventory.addMovie("Robocop",12.24);
        aInventory.addCopies("Robocop", 2);
        assertEquals(3,aInventory.getMovieQuantity("Robocop"));
    }

    @Test
    public void testGetPrice() throws Exception {
        Inventory aInventory = new Inventory();
        aInventory.addMovie("Robocop",12.24);
        assertEquals(12.24,aInventory.getMoviePrice("Robocop"),0.0);
    }

    @Test
    public void testGetQunatity() throws Exception {
        Inventory aInventory = new Inventory();
        aInventory.addMovie("Robocop",12.24);
        assertEquals(1,aInventory.getMovieQuantity("Robocop"));
    }

    @Test
    public void testSellMovie() throws Exception {
        Inventory aInventory = new Inventory();
        aInventory.addMovie("Robocop",12.24);
        aInventory.addMovie("Terminator",10.00);
        aInventory.sellMovie("Terminator");
        assertEquals(0,aInventory.getMovieQuantity("Terminator"));
    }


}
