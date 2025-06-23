package learning.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
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
