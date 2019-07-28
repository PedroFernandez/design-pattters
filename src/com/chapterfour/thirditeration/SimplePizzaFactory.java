package com.chapterfour.thirditeration;

public class SimplePizzaFactory {

    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new PeperoniPizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
