package com.himanshu.inventory;

import com.himanshu.commands.Command;
import com.himanshu.inventory.Caretaker;
import com.himanshu.inventory.Inventory;
import com.himanshu.inventory.Memento;
import com.himanshu.inventory.Originator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by hs0490 on 4/7/14.
 */
public class CommandInvoker {

    private ObjectOutputStream commandOutput;
    private int saveCommandCount;
    private Inventory aInventory;

    public CommandInvoker(Inventory aInventory) throws IOException {
        commandOutput = new ObjectOutputStream(new FileOutputStream("commands.ser"));
        this.aInventory = aInventory;
    }


    public void runCommand(Command aCommand) throws IOException {
        aCommand.execute(aInventory);
    }

    public void saveCommand(Command aCommand) throws IOException {

        // serializing command and increment save command count.
        commandOutput.writeObject(aCommand);
        saveCommandCount++;

        if(saveCommandCount == 4 ){
            commandOutput = new ObjectOutputStream(new FileOutputStream("commands.ser"));
            // serializing inventory after 4 commands
            Memento aMemento = new Originator().createMemento(aInventory);
            new Caretaker().addMemento(aMemento);
            System.out.println("Inventory object saved");
            saveCommandCount = 0;
        }

    }

}
