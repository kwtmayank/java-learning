package learning.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainIterator {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int val = iterator.next();
            System.out.println(val);
            if (val == 3) {
                iterator.remove();
            }
        }

        list.forEach(integerConsumer -> System.out.println(integerConsumer));
    }
}
