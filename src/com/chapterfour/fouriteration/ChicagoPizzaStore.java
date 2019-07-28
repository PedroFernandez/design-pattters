package com.chapterfour.fouriteration;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("greek")) {
            return new ChicagoStyleGreekPizza();
        } else if (type.equals("peperoni")){
            return new ChicagoStylePeperoniPizza();
        } else if (type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
