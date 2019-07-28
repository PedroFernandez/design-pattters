package com.chapterfour.thirditeration;

public class GreekPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare greek Pizza");
    }

    @Override
    public void bake() {
        System.out.println("bake greek Pizza");
    }

    @Override
    public void cut() {
        System.out.println("cut greek Pizza");
    }

    @Override
    public void box() {
        System.out.println("box greek Pizza");
    }
}
