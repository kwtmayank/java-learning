package learning.collections.compare;

import java.util.Arrays;

public class MainCompare {
    public static void main(String[] args) {
        Car car = new Car("red", 100);
        Car car1 = new Car("yellow", 400);
        Car car2 = new Car("blue", 900);
        Bus bus = new Bus("green");
        Bus bus1 = new Bus("black");
        Bus bus2 = new Bus("white");

        Car[] cars = new Car[]{car, car1, car2};
        Bus[] buses = new Bus[]{bus, bus1, bus2};

        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println("------------------");
        for (Bus b : buses) {
            System.out.println(b);
        }

        System.out.println("------------------");
        Arrays.sort(cars, (c1, c2) -> c1.getName().compareTo(c2.getName()));

        for (Car car3 : cars) {
            System.out.println(car3);
        }

        System.out.println("------------------");

        Arrays.sort(buses);

        for (Bus bus3 : buses) {
            System.out.println(bus3);
        }

    }
}
