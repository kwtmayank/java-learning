package learning.defaultI;

public class MainDefaultInterface {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        System.out.println(duck.canFly());


        //Anonymous class
        Bird bird = new Bird() {
            @Override
            public boolean canFly() {
                return false;
            }
        };

        System.out.println(bird.canFly());

        //Lambda expression
        Bird b2 = () -> true;
        System.out.println(b2.canFly());
    }
}