package learning.designPatterns.strategy;

public abstract class Character {
    public WeaponBehaviour weapon;
    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }
    public void fight() {
        weapon.useWeapon();
    }

    public abstract void display();
}
