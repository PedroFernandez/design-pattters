package com.chapterfour.thirditeration;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("box veggie Pizza");
    }
}
