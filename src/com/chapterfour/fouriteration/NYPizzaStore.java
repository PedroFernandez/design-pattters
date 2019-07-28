package com.chapterfour.fouriteration;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;

        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("greek")) {
            return new NYStyleGreekPizza();
        } else if (type.equals("peperoni")){
            return new NYStylePeperoniPizza();
        } else if (type.equals("veggie")){
        return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
