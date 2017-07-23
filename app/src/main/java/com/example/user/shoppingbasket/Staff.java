package com.example.user.shoppingbasket;

/**
 * Created by user on 22/07/2017.
 */

public class Staff implements Shoppable {

    private String name;
    private boolean staffCard;
    private int yearsService;

    public Staff(String name, boolean staffCard) {

        this.name = name;
        this.staffCard = staffCard;

    }

    public Staff(String name, boolean staffCard, int yearsService) {

        this.name = name;
        this.staffCard = staffCard;
        this.yearsService = yearsService;

    }

    public String getName() {

        return name;

    }

    public boolean hasCard() {

        return staffCard;

    }

    public int getYearsService() {

        return yearsService;

    }

}
