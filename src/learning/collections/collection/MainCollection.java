package learning.collections.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MainCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("------------------");

        System.out.println(list.get(2));

        list.remove(2);

        System.out.println("------------------");

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("------------------");

        System.out.println(list.size());

        System.out.println("------------------");

        System.out.println(list.contains(2));

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        System.out.println("------------------");
        System.out.println(stack.pop());

        System.out.println("------------------");

        System.out.println(list.containsAll(stack));


        System.out.println("------------------");

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));


    }
}
