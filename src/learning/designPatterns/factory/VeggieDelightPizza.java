package learning.designPatterns.factory;

import learning.designPatterns.factory.abstractfactory.PizzaIngredientFactory;

public class VeggieDelightPizza implements Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    VeggieDelightPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Using dough " + pizzaIngredientFactory.createDough().getClass().getSimpleName());
        System.out.println("Using sauce " + pizzaIngredientFactory.createSauce().getClass().getSimpleName());
        System.out.println("Preparing " + this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking " + this.getClass().getSimpleName());
    }

    @Override
    public void cut() {
        System.out.println();
    }

    @Override
    public void box() {
        System.out.println("Boxing " + this.getClass().getSimpleName());
    }

    @Override
    public double cost() {
        return 20.99;
    }
}
