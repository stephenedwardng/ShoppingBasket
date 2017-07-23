package com.example.user.shoppingbasket;

/**
 * Created by user on 23/07/2017.
 */

public class StaffDiscount implements Discountable {

    private Basket basket;
    private Staff staff;
    private int yearsService;
    private final int TENPOUND = 10;

    public StaffDiscount(Basket basket, Staff staff) {

        this.basket = basket;
        this.staff = staff;

    }

    public int applyPercentageDiscount() {

        double currentDiscount = basket.grossTotal();

        if (staff.getYearsService() < 1) {

            currentDiscount = basket.grossTotal() * 0.90;

        } else if (staff.getYearsService() > 1 && staff.getYearsService() < 3) {

            currentDiscount = basket.grossTotal() * 0.80;

        }  else if (staff.getYearsService() > 3) {

            currentDiscount = basket.grossTotal() * 0.70;

        }

        return (int)Math.round(currentDiscount);

    }

//    public int applyPercentageDiscount() {
//
//        double tenPoundDiscount = basket.grossTotal();
//
//        if (basket.grossTotal() > TENPOUND) {
//            tenPoundDiscount = basket.grossTotal() * 0.7;
//        }
//
//        return (int)Math.round(tenPoundDiscount);
//
//    }

    public int applyCardDiscount() {

        double staffDiscount = applyPercentageDiscount();

        if (staff.hasCard()) {
            staffDiscount = applyPercentageDiscount() * 0.95;
        }

        return (int)Math.round(staffDiscount);

    }

    public int discountPrice() {

        return applyCardDiscount();

    }

}
