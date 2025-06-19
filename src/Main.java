import main.defaultinterface.Duck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        System.out.println(duck.canFly());
    }
}