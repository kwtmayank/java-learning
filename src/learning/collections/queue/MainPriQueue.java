package learning.collections.queue;

import java.util.PriorityQueue;

public class MainPriQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(5); //This is minimum priority queue
        queue.add(1);
        queue.add(2);
        queue.add(8);
        queue.add(5);
        queue.add(6);
        queue.offer(6);
        queue.offer(7);
        queue.forEach(integer -> System.out.println(integer));
        System.out.println("------------------");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("------------------");
        System.out.println(queue.peek());
        System.out.println("------------------");
        System.out.println(queue.size());
        System.out.println("------------------");
        System.out.println(queue.contains(8));
        System.out.println("------------------");
        System.out.println(queue.poll());
        System.out.println("------------------");
        try {
            queue.element();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("------------------");


        PriorityQueue<Integer> queue2 = new PriorityQueue<>(5, (o1, o2) -> o2-o1); //This is
        // maximum
        // priority queue
        queue2.add(1);
        queue2.add(2);
        queue2.add(8);
        queue2.add(5);
        queue2.add(6);
        queue2.forEach(integer -> System.out.println(integer));


    }
}
