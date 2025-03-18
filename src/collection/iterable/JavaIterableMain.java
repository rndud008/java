package collection.iterable;

import javax.crypto.SecretKey;
import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> listIterator = list.iterator();

//        while (listIterator.hasNext()){
//            System.out.println("listIterator.next() = " + listIterator.next());
//        }

        printAll(listIterator);
        forEach(list);

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        Iterator<Integer> setIterator = set.iterator();
//        while (setIterator.hasNext()){
//            System.out.println("iterator1.next() = " + setIterator.next());
//        }
        printAll(setIterator);
        forEach(set);
    }

//    private static void forEach(Set<Integer> set){
//        //iteralbe 로 구현하면?
//        for (Integer i : set){
//            System.out.println(i);
//        }
//    }
//
//    private static void forEach(List<Integer> set){
//        //iteralbe 로 구현하면?
//        for (Integer i : set){
//            System.out.println(i);
//        }
//    }

    private static void forEach(Iterable<Integer> iterable) {
        //iteralbe 로 구현하면?
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator.getClass() = " + iterator.getClass());

        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
