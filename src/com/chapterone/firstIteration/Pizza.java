package com.chapterone.firstIteration;

public class Pizza {

    public void prepare()
    {
        System.out.printf("prepare pizza");
    }

    public void bake()
    {
        System.out.println("bake pizza");
    }

    public void cut()
    {
        System.out.println("cut pizza");
    }

    public void box()
    {
        System.out.println("box pizza");
    }

    public Pizza orderPizza()
    {
        Pizza pizza = new Pizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
