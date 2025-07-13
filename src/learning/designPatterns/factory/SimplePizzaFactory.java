package learning.designPatterns.factory;

public abstract class SimplePizzaFactory {
//    public Pizza createPizza(String type) {
//        switch (type){
//            case "cheese":
//                return new CheesePizza();
//            case "veggie":
//                return new VeggieDelightPizza();
//            default:
//                return null;
//        }
//    }

    public abstract Pizza createPizza(String type);
}
