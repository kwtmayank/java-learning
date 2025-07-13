package learning.designPatterns.factory.toppings;

import learning.designPatterns.factory.Pizza;

public class Olives extends ToppingsDecorator {
    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toppingName() {
        return "Pizza with Olives";
    }


    @Override
    public double cost() {
        return pizza.cost() + 0.5;
    }
}
