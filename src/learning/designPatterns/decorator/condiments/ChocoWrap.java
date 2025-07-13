package learning.designPatterns.decorator.condiments;

import learning.designPatterns.decorator.Beverage;
import learning.designPatterns.decorator.CondimentDecorator;

public class ChocoWrap extends CondimentDecorator {
    Beverage beverage;

    public ChocoWrap(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Choco Wrap";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.2;
    }
}
