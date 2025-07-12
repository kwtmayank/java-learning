package learning.designPatterns.strategy;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        System.out.println("Using sword");
    }
}
