package learning.collections.list;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);
        System.out.println("------------------");
        System.out.println(linkedList.get(2));
        System.out.println("------------------");
        System.out.println(linkedList.size());
        System.out.println("------------------");
        System.out.println(linkedList.contains(2));
        System.out.println("------------------");
        System.out.println(linkedList.isEmpty());
        System.out.println("------------------");
        System.out.println(linkedList.set(2, 100));
        System.out.println("------------------");
        System.out.println(linkedList);
        System.out.println("------------------");
        System.out.println(linkedList.remove(2));
        System.out.println("------------------");
        System.out.println(linkedList);
        System.out.println("------------------");
        linkedList.addFirst(1);
        linkedList.addLast(1);
        System.out.println(linkedList);
    }

}
