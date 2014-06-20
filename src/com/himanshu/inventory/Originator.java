package com.himanshu.inventory;

/**
 * Created by hs0490 on 4/2/14.
 */
public class Originator {


    Memento createMemento(Inventory aInventory){
       return new Memento(aInventory);
    }

    public Inventory setMemento(Memento aMemento){
        return aMemento.getInventory();
    }


}
