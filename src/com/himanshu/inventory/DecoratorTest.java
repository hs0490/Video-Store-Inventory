package com.himanshu.inventory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hs0490 on 4/15/14.
 */
public class DecoratorTest {
    @Test
    public void testAddMovie() throws Exception {
        Inventory aInventory = new Inventory();
        InventoryDecorator aDecorator = new InventoryDecorator(aInventory);
        aDecorator.addMovie("Robocop",12.24);

        assertEquals(1,aDecorator.getMovieQuantity("Robocop"));
    }

    @Test
    public void testChangePrice() throws Exception {
        Inventory aInventory = new Inventory();
        InventoryDecorator aDecorator = new InventoryDecorator(aInventory);
        aDecorator.addMovie("Robocop",12.24);
        aDecorator.changePrice("Robocop",11.34);

        assertEquals(11.34, aDecorator.getMoviePrice("Robocop"),0.00);

    }

    @Test
    public void testAddCopies() throws Exception {
        Inventory aInventory = new Inventory();
        InventoryDecorator aDecorator = new InventoryDecorator(aInventory);
        aDecorator.addMovie("Robocop",12.24);
        aDecorator.addCopies("Robocop",3);

        assertEquals(4, aDecorator.getMovieQuantity("Robocop"));

    }

    @Test
    public void testSellMovie() throws Exception {
        Inventory aInventory = new Inventory();
        InventoryDecorator aDecorator = new InventoryDecorator(aInventory);
        aDecorator.addMovie("Robocop",12.24);
        aDecorator.sellMovie("Robocop");

        assertEquals(0,aDecorator.getMovieQuantity("Robocop"));

    }
}
