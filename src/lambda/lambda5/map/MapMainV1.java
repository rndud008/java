package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;

public class MapMainV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1","12","123","1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = mapStringToInteger(list);
        System.out.println("numbers = " + numbers);

        // 문자열의 길이
        List<Integer> lengths = mapStringToLength(list);
        System.out.println("lengths = " + lengths);
    }

    private static List<Integer> mapStringToLength(List<String> list) {
        List<Integer> result = new ArrayList<>();
        for(String str : list){
            result.add(str.length());
        }
        return result;

    }

    private static List<Integer> mapStringToInteger(List<String> list) {
        List<Integer> result = new ArrayList<>();
        for(String str : list){
            result.add(Integer.valueOf(str));
        }
        return result;
    }
}
