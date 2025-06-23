package learning.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MainStream {

    public static void main(String[] args) {

        //From Collections
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);


        //From Arrays
        Stream<Integer> stream = Arrays.stream(new Integer[] {1,2,3,4,5,6});
        System.out.println("------------------");
        System.out.println(stream.count());

        //From Stream
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6);
        System.out.println("------------------");
        System.out.println(stream1.count());

        //From Stream Builder
        Stream<Object> stream2 = Stream.builder()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .add(6)
                .build();
        System.out.println("------------------");
        System.out.println(stream2.count());

    }
}
