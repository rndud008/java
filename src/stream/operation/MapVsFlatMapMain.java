package stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(1, 2)
                , List.of(3, 4)
                , List.of(5, 6)
        );

        System.out.println("lists = " + lists);
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : lists){
            for (Integer i : list){
                forResult.add(i);
            }
        }
        System.out.println("forResult = " + forResult);

        // map
        List<Stream<Integer>> mapResult = lists.stream()
                .map(list -> list.stream())
                .toList();
        System.out.println("mapResult = " + mapResult);

        //flatMap
        List<Integer> flatMapResult = lists.stream().flatMap(list -> list.stream()).toList();
        System.out.println("flatMapResult = " + flatMapResult);

    }
}
