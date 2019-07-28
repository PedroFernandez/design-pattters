package com.chapterone.seconditeration;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("prepare bake pizza");
    }

    @Override
    public void cut() {
        System.out.println("prepare cut pizza");
    }

    @Override
    public void box() {
        System.out.println("prepare box pizza");
    }
}
