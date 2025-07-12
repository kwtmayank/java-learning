package learning.designPatterns.strategy;

public class Game {
    public static void main(String[] args) {
        Character character = new QueenCharacter();
        character.setWeapon(new AxeBehaviour());
        character.fight();
        character.display();
        character.setWeapon(new SwordBehaviour());
        character.fight();
        character.display();
    }
}
