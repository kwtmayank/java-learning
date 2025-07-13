package learning.designPatterns.factory.toppings;
import learning.designPatterns.factory.Pizza;

public abstract class ToppingsDecorator implements Pizza {
    public abstract String toppingName();
    public abstract double cost();

    @Override
    public void prepare() {
        System.out.println("NA");
    }

    @Override
    public void bake() {
        System.out.println("NA");
    }

    @Override
    public void cut() {
        System.out.println("NA");
    }

    @Override
    public void box() {
        System.out.println("NA");
    }
}
