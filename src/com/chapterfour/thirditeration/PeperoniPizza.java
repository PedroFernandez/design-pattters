package com.chapterfour.thirditeration;

public class PeperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare peperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake peperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut peperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("box peperoni Pizza");
    }
}
