package learning.designPatterns.factory.abstractfactory;

public class NyStylePizzaIngedients implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrushDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarianaSauce();
    }


}
