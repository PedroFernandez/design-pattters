package com.chapterfour.dummy;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String cheese;
    double price;
    ArrayList<String>toppings = new ArrayList<String>();


    public void prepare()
    {
        System.out.println("Preparing abstract class Pizza" + name);
        System.out.println("It has this delicious dough: " + dough);
        System.out.println("And only for " + price + "USD");
        System.out.println("With all these toppings ");
        for (String topping: toppings) {
            System.out.println("    " + topping);
        }
    }

    public void bake()
    {
        System.out.println("Baking abstract class Pizza");
    }

    public void cut()
    {
        System.out.println("Cutting abstract class Pizza");
    }

    public void box()
    {
        System.out.println("Boxing abstract class Pizza");
    }

    public String getName()
    {
        return this.name;
    }
}
