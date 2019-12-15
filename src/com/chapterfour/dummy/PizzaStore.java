package com.chapterfour.dummy;

public abstract class PizzaStore {
    public Pizza orderPizza(String type)
    {
        Pizza pizza = null;
        pizza = this.makePizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza makePizza(String type);
}
