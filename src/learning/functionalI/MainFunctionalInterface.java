package learning.functionalI;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MainFunctionalInterface {
    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello");

        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(function.apply("hello"));

        Predicate<String> predicate = s -> s.length() > 5;
        System.out.println(predicate.test("Hello"));


    }
}
