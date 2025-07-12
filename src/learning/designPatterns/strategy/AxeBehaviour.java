package learning.designPatterns.strategy;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Using Axe");
    }
}
