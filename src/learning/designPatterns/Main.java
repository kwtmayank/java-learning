package learning.designPatterns;

import learning.designPatterns.decorator.Beverage;
import learning.designPatterns.decorator.condiments.ChocoWrap;
import learning.designPatterns.decorator.condiments.GingerCardamom;
import learning.designPatterns.decorator.drinks.DarkRoast;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new ChocoWrap(beverage);
        beverage = new GingerCardamom(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}
