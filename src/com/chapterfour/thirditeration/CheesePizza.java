package com.chapterfour.thirditeration;

public class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("box cheese Pizza");
    }
}
