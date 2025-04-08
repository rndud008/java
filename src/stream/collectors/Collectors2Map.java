package stream.collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato").collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println("map1 = " + map1);


        // 키중복 예외 발상 : Exception in thread "main" java.lang.IllegalStateException: Duplicate key Apple (attempted merging values 5 and 5)
//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato").collect(Collectors.toMap(name -> name, name -> name.length()));
//        System.out.println("map2 = " + map2);

        Map<String, Integer> map3 = Stream
                .of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name
                        , name -> name.length()
                        , (oldVal, newVal) -> oldVal +  newVal) // 중복될 경우 기존 값 + 새 값
                );
        System.out.println("map3 = " + map3);

        //Map의 타입 지정
        Map<String, Integer> map4 = Stream
                .of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name
                        , name -> name.length()
                        , (oldVal, newVal) -> oldVal +  newVal , LinkedHashMap::new) // 중복될 경우 기존 값 + 새 값

                );
        System.out.println("map4 = " + map4.getClass());
    }
}
