package learning.designPatterns.factory;

import learning.designPatterns.factory.abstractfactory.NyStylePizzaIngedients;
import learning.designPatterns.factory.abstractfactory.PizzaIngredientFactory;

public class ChicagoStylePizza extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
         switch (type) {
            case "cheese" -> {
                PizzaIngredientFactory ingredientFactory = new NyStylePizzaIngedients();
                return new CheesePizza(ingredientFactory);
            }
            case "veggie" -> {
                PizzaIngredientFactory ingredientFactory = new NyStylePizzaIngedients();
                return new VeggieDelightPizza(ingredientFactory);
            }
        };
        return null;
    }
}
