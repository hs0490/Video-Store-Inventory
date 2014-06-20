package com.himanshu.commands;

import com.himanshu.inventory.Inventory;

import java.io.IOException;
import java.io.Serializable;

/**
 * Created by hs0490 on 4/5/14.
 */
public interface Command extends Serializable {

    public void execute(Inventory aInventory) throws IOException;



}
