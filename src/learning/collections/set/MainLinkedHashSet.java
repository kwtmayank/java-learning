package learning.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class MainLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
        System.out.println("------------------");
        System.out.println(set.contains(2));
        System.out.println("------------------");
        System.out.println(set.size());
        System.out.println("------------------");
        System.out.println(set.isEmpty());
        System.out.println("------------------");
        set.remove(2);
        System.out.println(set);
        System.out.println("------------------");
        set.clear();
        System.out.println(set);
    }
}
