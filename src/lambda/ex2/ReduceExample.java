package lambda.ex2;

import java.util.List;

public class ReduceExample {
    public static int reduce(List<Integer> list, int initial, MyReducer reducer){
        int total=initial;
        for (int value : list){
            total = reducer.reduce(total,value);
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
