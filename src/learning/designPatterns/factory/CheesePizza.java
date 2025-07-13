package learning.designPatterns.factory;

import learning.designPatterns.factory.abstractfactory.Dough;
import learning.designPatterns.factory.abstractfactory.PizzaIngredientFactory;
import learning.designPatterns.factory.abstractfactory.Sauce;

public class CheesePizza implements Pizza {
    private PizzaIngredientFactory  pizzaIngredientFactory;

    CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Using dough "+pizzaIngredientFactory.createDough().getClass().getSimpleName());
        System.out.println("Using sauce "+pizzaIngredientFactory.createSauce().getClass().getSimpleName());
        System.out.println("Preparing " + this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking " + this.getClass().getSimpleName());
    }

    @Override
    public void cut() {
        System.out.println("Cutting " + this.getClass().getSimpleName());
    }

    @Override
    public void box() {
        System.out.println("Boxing " + this.getClass().getSimpleName());
    }

    @Override
    public double cost() {
        return 10.99;
    }
}
