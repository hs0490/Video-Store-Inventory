package com.himanshu.inventory;

import java.io.*;

/**
 * Created by hs0490 on 4/2/14.
 */
public class Caretaker {

    void addMemento(Memento inventoryMemento ) throws IOException {
        ObjectOutputStream output =  new ObjectOutputStream(new FileOutputStream("inventory.ser"));
        output.writeObject(inventoryMemento);
        output.close();
    }

     public Memento getMemento() throws IOException, ClassNotFoundException {
       ObjectInputStream input = new ObjectInputStream(new FileInputStream("inventory.ser"));
       return (Memento) input.readObject();
    }

}
