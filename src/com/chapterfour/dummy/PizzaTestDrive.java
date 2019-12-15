package com.chapterfour.dummy;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore myStore = new NYPizzaStore();
        Pizza pizza = myStore.orderPizza("cheese");
        System.out.println("Pedro is eating happily a " + pizza.getName());
    }
}
