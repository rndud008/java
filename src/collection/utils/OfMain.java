package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list.getClass() = " + list.getClass());

//        list = [1, 2, 3]
//        set = [3, 1, 2]
//        map = {2=two, 1=one}
//        list.getClass() = class java.util.ImmutableCollections$ListN

        //list.add(4); // Exception 발생. 불변컬렉션을 변경을 시도 하려 해서.
        // Exception in thread "main" java.lang.UnsupportedOperationException

    }
}
