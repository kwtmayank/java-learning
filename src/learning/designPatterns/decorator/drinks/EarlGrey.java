package learning.designPatterns.decorator.drinks;

import learning.designPatterns.decorator.Beverage;

public class EarlGrey implements Beverage {
    @Override
    public String getDescription() {
        return "Earl Grey";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
