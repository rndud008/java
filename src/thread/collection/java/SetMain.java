package thread.collection.java;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> copyset = new CopyOnWriteArraySet<>();
        copyset.add(1);
        copyset.add(2);
        copyset.add(3);

        System.out.println("copyset = " + copyset);

        Set<Integer> skipeSet = new ConcurrentSkipListSet<>();
        skipeSet.add(3);
        skipeSet.add(2);
        skipeSet.add(1);

        System.out.println("skipeSet = " + skipeSet);
    }
}
