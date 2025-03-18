package collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);
        Collections.sort(list);
        System.out.println("sort list = " + list);
        Collections.reverse(list);
        System.out.println("reverse list = " + list);
//
//        min = 1
//        max = 5
//        list = [1, 2, 3, 4, 5]
//        shuffle list = [4, 2, 1, 3, 5]
//        sort list = [1, 2, 3, 4, 5]
//        reverse list = [5, 4, 3, 2, 1]


    }
}
