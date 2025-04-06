package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenricFilter;
import lambda.lambda5.map.GenricMapper;
import nested.test.ex1.Library;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {

    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);

        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<Integer> lambda(List<Integer> numbers) {
        List<Integer> filter = GenricFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> map = GenricMapper.map(filter, value -> value * 2);
        return map;
    }

    private static List<Integer> direct(List<Integer> numbers) {
        List<Integer> list= new ArrayList<>();
        for (Integer value : numbers){
            if (value %2 == 0){
                list.add(value*2);
            }
        }
        return list;
    }
}
