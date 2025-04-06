package lambda.ex3;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ReduceExample {
    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer){
        int total=initial;
        for (int value : list){
            total = reducer.apply(total,value);
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        System.out.println("리스트: " + numbers);

        int sum = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("sum = " + sum);

        int product = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("product = " + product);

    }
}
