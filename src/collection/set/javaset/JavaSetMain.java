package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());

    }

    private static void run(Set<String> set){
        System.out.println("set.getClass() = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print( iterator.next() + " ");
        }
        System.out.println();

//        set.getClass() = class java.util.HashSet // 입력한 순서를 보장하지 않음.
//        set = [A, 1, B, 2, C]
//        A 1 B 2 C

//        set.getClass() = class java.util.LinkedHashSet // 입력한 순서를 정확히 보장.
//        set = [C, B, A, 1, 2]
//        C B A 1 2

//        set.getClass() = class java.util.TreeSet // 데이터 값을 기준으로 정렬
//        set = [1, 2, A, B, C]
//        1 2 A B C

    }
}
