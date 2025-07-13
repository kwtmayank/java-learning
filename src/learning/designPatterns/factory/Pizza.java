package learning.designPatterns.factory;

import learning.designPatterns.factory.abstractfactory.PizzaIngredientFactory;

public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
    double cost();
}
