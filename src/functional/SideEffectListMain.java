package functional;

import java.util.ArrayList;
import java.util.List;

public class SideEffectListMain {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");

        System.out.println("before list1 = " + list1);
        ChangeList1(list1);
        System.out.println("after list1 = " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");

        System.out.println("before list2 = " + list2);
        List<String> result = ChangeList2(list2);
        System.out.println("after list2 = " + list2);
        System.out.println("result = " + result);
    }

    private static List<String> ChangeList2(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String s : list){
            newList.add(s + "_complete");
        }
        return newList;
    }

    private static void ChangeList1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i) + "_complete");
        }
    }
}
