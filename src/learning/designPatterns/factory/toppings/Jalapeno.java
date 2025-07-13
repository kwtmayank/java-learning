package learning.designPatterns.factory.toppings;

import learning.designPatterns.factory.Pizza;

public class Jalapeno extends ToppingsDecorator {
    Pizza pizza;

    public Jalapeno(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toppingName() {
        return "Pizza with Jalapeno";
    }


    @Override
    public double cost() {
        return pizza.cost() + 0.75;
    }
}
