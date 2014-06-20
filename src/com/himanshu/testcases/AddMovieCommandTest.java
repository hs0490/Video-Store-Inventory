package com.himanshu.testcases;


import com.himanshu.commands.AddMovieCommand;
import com.himanshu.inventory.Inventory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hs0490 on 4/7/14.
 */
public class AddMovieCommandTest {

    @Test
    public void testExecute() throws Exception {
        Inventory aInventory = new Inventory();

        for(int i=0; i<=5; i++){
            AddMovieCommand addCommand = new AddMovieCommand("Terminator",12.23);
            addCommand.execute(aInventory);
        }

        assertEquals(6,aInventory.getMovieQuantity("Terminator"));


    }
}
