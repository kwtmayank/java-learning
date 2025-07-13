package learning.designPatterns.factory;

import learning.designPatterns.factory.toppings.Jalapeno;
import learning.designPatterns.factory.toppings.Olives;
import learning.designPatterns.factory.toppings.ToppingsDecorator;

public class PizzaStore {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new NyStylePizzaStore();
        Pizza pizza = factory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza = new Olives(pizza);
        pizza = new Jalapeno(pizza);
        System.out.println("Total cost is : "+pizza.cost());
    }
}
