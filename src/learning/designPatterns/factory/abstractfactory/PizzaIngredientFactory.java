package learning.designPatterns.factory.abstractfactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
}
