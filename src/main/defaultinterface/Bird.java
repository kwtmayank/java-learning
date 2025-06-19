package main.defaultinterface;

public interface Bird {
    default void fly(){
        System.out.println("I can fly");
        sing();
    }

    boolean canFly();

    private void sing(){
        System.out.println("I can sing");
    }
}
