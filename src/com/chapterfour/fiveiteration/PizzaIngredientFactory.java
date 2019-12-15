package com.chapterfour.fiveiteration;

import com.chapterfour.fiveiteration.model.interfaces.*;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
