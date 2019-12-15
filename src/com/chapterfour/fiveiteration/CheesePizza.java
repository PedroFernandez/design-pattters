package com.chapterfour.fiveiteration;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("I am preparing " + name);
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
        sauce = pizzaIngredientFactory.createSauce();
        System.out.println("With the following ingredients: ");
        System.out.println(cheese);
        System.out.println(clam);
        System.out.println(sauce);
    }
}
