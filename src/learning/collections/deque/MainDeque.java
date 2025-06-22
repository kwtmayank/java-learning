package learning.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainDeque {
    public static void main(String[] args) {
        //Deque as Stack
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("------------------");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("------------------");
        //Deque as Queue
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        System.out.println("------------------");
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
    }
}
