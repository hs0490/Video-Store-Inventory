package com.himanshu.testcases;


import com.himanshu.commands.AddCopiesCommand;
import com.himanshu.commands.AddMovieCommand;
import com.himanshu.inventory.Inventory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hs0490 on 4/7/14.
 */
public class AddCopiesCommandTest {

    @Test
    public void testExecute() throws Exception {
        Inventory aInventory = new Inventory();

        AddMovieCommand addCommand = new AddMovieCommand("Robocop",12.23);
        addCommand.execute(aInventory);

        AddCopiesCommand copiesCommand = new AddCopiesCommand("Robocop",3);
        copiesCommand.execute(aInventory);

        assertEquals(4,aInventory.getMovieQuantity("Robocop"));

    }
}
