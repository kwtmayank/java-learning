package learning.collections.list;

import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector.get(2));
    }
}
