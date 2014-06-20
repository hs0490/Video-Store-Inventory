package com.himanshu.testcases;

import com.himanshu.client.RestoreInventory;
import com.himanshu.inventory.Inventory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hs0490 on 4/9/14.
 */
public class RestoreInventoryTest {
    @Test
    public void testMain() throws Exception {

        Inventory aInventory = RestoreInventory.restoreInventory();

        assertEquals(6,aInventory.getMovieQuantity("Terminator"));

    }
}
