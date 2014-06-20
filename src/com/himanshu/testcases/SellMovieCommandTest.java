package com.himanshu.testcases;


import com.himanshu.commands.AddMovieCommand;
import com.himanshu.inventory.Inventory;
import com.himanshu.commands.SellMovieCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hs0490 on 4/7/14.
 */
public class SellMovieCommandTest {


    @Test
    public void testExecute() throws Exception {
        Inventory aInventory = new Inventory();

        AddMovieCommand addCommand = new AddMovieCommand("Robocop",12.23);
        addCommand.execute(aInventory);

        SellMovieCommand sellCommand = new SellMovieCommand("Robocop");
        sellCommand.execute(aInventory);

        assertEquals(0,aInventory.getMovieQuantity("Robocop"));


    }


}
