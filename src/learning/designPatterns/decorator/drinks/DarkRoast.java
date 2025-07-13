package learning.designPatterns.decorator.drinks;

import learning.designPatterns.decorator.Beverage;

public class DarkRoast implements Beverage {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
