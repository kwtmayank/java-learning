package learning.map;

import java.util.Map;
import java.util.TreeMap;

public class MainTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        System.out.println("------------------");
        System.out.println("map - "+map);
        System.out.println("------------------");
        System.out.println("map.headMap(2) - "+map.headMap(2));
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
        System.out.println("------------------");
        System.out.println("map.keySet() - "+map.keySet());
        System.out.println("------------------");
        System.out.println("map.values() - "+map.values());
        System.out.println("------------------");
    }
}
