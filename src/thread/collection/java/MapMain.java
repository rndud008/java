package thread.collection.java;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String > map1 = new  ConcurrentHashMap<>();
        map1.put(3,"date3");
        map1.put(2,"date2");
        map1.put(1,"date1");

        System.out.println("copyset = " + map1);

        Map<Integer, String > map2 = new ConcurrentSkipListMap<>();
        map2.put(3,"date3");
        map2.put(2,"date2");
        map2.put(1,"date1");


        System.out.println("map2 = " + map2);
    }
}
