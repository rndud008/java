package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {
    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList(); // 자바 5
        List<Integer> list4 = List.of(); // 자바 9

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());



        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 =  List.of(1,2,3);

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList1 = Arrays.asList(arr);
        arrList1.set(0,100);

        System.out.println("arrList1 = " + arrList1);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

//        arrList1 = [100, 2, 3, 4, 5]
//        Arrays.toString(arr) = [100, 2, 3, 4, 5]
//          Arrays.asList(arr) 를 만뜰때 arr 의 참조값을 그대로 가져가서 써가지고 값이 둘다인 arrList1 와 arr 변경됨.

        List<Integer> arrList2 = List.of(arr);

//        list3 = class java.util.Collections$EmptyList
//        list4 = class java.util.ImmutableCollections$ListN
    }
}
