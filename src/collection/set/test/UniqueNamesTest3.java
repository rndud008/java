package collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {



    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        List<Integer> list = List.of(inputArr);

//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new LinkedHashSet<>(list);
        Set<Integer> set = new TreeSet<>(list);

        List<Integer> list1 = Arrays.asList(inputArr);
        List<Integer> list2 = List.of(inputArr);

        System.out.println("list2 = " + list2);
        System.out.println("list1 = " + list1);

//        for (Integer i : inputArr){
//            set.add(i);
//        }

        System.out.println("set = " + set);

        for (Integer i : set){
            System.out.println("i = " + i);
        }
    }
}
