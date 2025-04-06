package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

    // 고차 함수, 함수를 인자로 받아, 리스트의 각 요소를 변환
    public static List<String> map (List<String > list, StringFunction func){
        List<String> result = new ArrayList<>();
        for (String str : list){
            result.add(func.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello","java","lambda");
        System.out.println("words = " + words);

        List<String> upperList = map(words, value -> value.toUpperCase());
        System.out.println("upperList = " + upperList);

        List<String> decoratedList = map(words, value -> "***" + value + "***");
        System.out.println("decoratedList = " + decoratedList);
    }
}
