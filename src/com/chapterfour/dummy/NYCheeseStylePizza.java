package com.chapterfour.dummy;

public class NYCheeseStylePizza extends Pizza {
    public NYCheeseStylePizza() {
        name = "NY Cheese Style Pizza";
        dough = "NY Cheese Style dough";
        price = 14.99;

        toppings.add("onions");
    }

    @Override
    public void cut() {
        System.out.println("This pizza is served sliced in four big portions");
    }
}
