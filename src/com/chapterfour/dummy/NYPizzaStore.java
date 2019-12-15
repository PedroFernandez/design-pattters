package com.chapterfour.dummy;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza makePizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheeseStylePizza();
        } else {
            return null;
        }
    }
}
