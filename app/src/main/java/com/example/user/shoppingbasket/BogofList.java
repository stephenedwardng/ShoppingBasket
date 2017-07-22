package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 22/07/2017.
 */

public class BogofList {

    private ArrayList<Item> bogofs;

    public BogofList(ArrayList<Item> bogofs) {
        this.bogofs = bogofs;
    }

    public ArrayList<Item> getBogofs() {

        return bogofs;

    }

    public void addBogof(Item bogof) {

        bogofs.add(bogof);

    }

}
