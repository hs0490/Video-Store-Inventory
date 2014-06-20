package com.himanshu.client;


import com.himanshu.commands.Command;
import com.himanshu.inventory.*;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by hs0490 on 4/5/14.
 */
public class RestoreInventory {

    public static Inventory restoreInventory() throws IOException, ClassNotFoundException {

        Memento aInventoryMemento = new Caretaker().getMemento(); // get serialized inventory object from file
        Inventory aInventory = new Originator().setMemento(aInventoryMemento);
       // CommandInvoker invoker = new CommandInvoker(aInventory);
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("commands.ser"));

        try {
            while (true){
               Command aCommand = (Command)input.readObject();
               aCommand.execute(aInventory);
            }
        }
        catch (EOFException e){
            input.close();

        }

        return aInventory;

    }
}
