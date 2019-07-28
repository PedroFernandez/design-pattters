package com.chapterfour.fouriteration;

public class Main {
    public static void main (String[] args) {
        PizzaStore myNYStore = new NYPizzaStore();
        Pizza pizza = myNYStore.orderPizza("cheese");
        System.out.println("Paula is eating a pizza " + pizza.getName());
    }
}
