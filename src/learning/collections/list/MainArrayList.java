package learning.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        System.out.println("------------------");
        System.out.println(list.get(2));
        System.out.println("------------------");
        System.out.println(list.size());
        System.out.println("------------------");
        System.out.println(list.contains(2));
        System.out.println("------------------");
        System.out.println(list.isEmpty());
        System.out.println("------------------");
        System.out.println(list.set(2, 100));
        System.out.println("------------------");
        System.out.println(list);
        System.out.println("------------------");
        System.out.println(list.remove(2));
        System.out.println("------------------");
        System.out.println(list);
        System.out.println("------------------");
        List<Integer> subList = list.subList(1, 4);
        System.out.println(subList);
        System.out.println("------------------");
        subList.clear();
        System.out.println(list);
        System.out.println("------------------");
        list.addAll(List.of(6, 7, 8, 9,10));
        System.out.println(list);
        System.out.println("------------------");
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------");
        ListIterator<Integer> backwardIterator = list.listIterator(list.size());
        while (backwardIterator.hasPrevious()) {
            System.out.println(backwardIterator.previous());
        }
    }
}
