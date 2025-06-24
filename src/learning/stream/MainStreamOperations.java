package learning.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,5,321,654,32484,31,316584,12,654654,321,684,31,84,
                321,84,31,8998,4,89,32,84,1,894,31,-54,-454,-12,897,-123,454);

        long currentTimeMillis = System.currentTimeMillis();
        long countOfElements = list.stream()
                .peek(i -> System.out.println("Value is: "+i))
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println("Filtered value is: "+i))
                .map(i -> i * 2)
                .peek(i -> System.out.println("Mapped value is: "+i))
                .sorted()
                .peek(i -> System.out.println("Sorted value is: "+i))
                .distinct()
                .peek(i -> System.out.println("Distinct value is: "+i))
                .limit(5)
                .peek(i -> System.out.println("Limited value is: "+i))
                .count();

        System.out.println("------------------"+countOfElements);
        System.out.println("Time taken is: "+(System.currentTimeMillis() - currentTimeMillis));


        currentTimeMillis = System.currentTimeMillis();
        countOfElements = list.parallelStream()
                .peek(i -> System.out.println("parallelStream Value is: "+i))
                .filter(i -> i % 2 == 0)
                .peek(i -> System.out.println("parallelStream Filtered value is: "+i))
                .map(i -> i * 2)
                .peek(i -> System.out.println("parallelStream Mapped value is: "+i))
                .sorted()
                .peek(i -> System.out.println("parallelStream Sorted value is: "+i))
                .distinct()
                .peek(i -> System.out.println("parallelStream Distinct value is: "+i))
                .limit(5)
                .peek(i -> System.out.println("parallelStream Limited value is: "+i))
                .count();

        System.out.println("------------------"+countOfElements);
        System.out.println("parallelStream Time taken is: "+(System.currentTimeMillis() - currentTimeMillis));
    }
}
