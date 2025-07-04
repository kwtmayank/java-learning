package learning.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println("------------------");
        System.out.println("map.get(2) - "+map.get(2));
        System.out.println("------------------");
        System.out.println("map.containsKey(2) - "+map.containsKey(2));
        System.out.println("------------------");
        System.out.println("map.containsValue(\"A\") - "+map.containsValue("A"));
        System.out.println("------------------");
        System.out.println("map.size() - "+map.size());
        System.out.println("------------------");
        System.out.println("map.isEmpty() - "+map.isEmpty());
        System.out.println("------------------");
        map.remove(2);
        System.out.println("map - "+map);
        System.out.println("------------------");
        map.clear();
        System.out.println("map - "+map);
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(null, "D");
        System.out.println("------------------");
        System.out.println("map.keySet() - "+map.keySet());
        System.out.println("------------------");
        System.out.println("map.values() - "+map.values());
        System.out.println("------------------");
        System.out.println("map.entrySet() - "+map.entrySet());


        Map<Integer, String> map2 = new Hashtable<>();
        map2.put(1, "A1");
        map2.put(2, "B1");
        map2.put(3, "C1");
      //  map2.put(null, "C1");
        System.out.println("------------------");
        System.out.println("map.equals(map2) - "+map.equals(map2));
        System.out.println("------------------");
        System.out.println("map.hashCode() - "+map.hashCode());
        System.out.println("------------------");
        System.out.println("map2.hashCode() - "+map2.hashCode());
    }
}
