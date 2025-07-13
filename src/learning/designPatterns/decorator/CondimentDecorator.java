package learning.designPatterns.decorator;

public abstract class CondimentDecorator implements Beverage {
    public abstract String getDescription();
    public abstract double cost();
}
