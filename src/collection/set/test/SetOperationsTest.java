package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        System.out.println("union = " + union); // 합집합.

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection = " + intersection); // 교집합

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("difference = " + difference); // 차집합

//        set1 = [1, 2, 3, 4, 5]
//        set2 = [3, 4, 5, 6, 7]
//        union = [1, 2, 3, 4, 5, 6, 7]
//        intersection = [3, 4, 5]
//        difference = [1, 2]

    }
}
