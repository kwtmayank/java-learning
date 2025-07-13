package learning.designPatterns.decorator.condiments;

import learning.designPatterns.decorator.Beverage;
import learning.designPatterns.decorator.CondimentDecorator;

public class GingerCardamom extends CondimentDecorator {
    Beverage beverage;

    public GingerCardamom(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Ginger Cardamom";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
