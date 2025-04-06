package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        // 짝수만 거르기
        Predicate<Integer> evenPredicate = value -> value %2 == 0;
        List<Integer> evenNumbers = filter(numbers, evenPredicate);
        System.out.println("evenNumbers = " + evenNumbers);

        Predicate<Integer> oddPredicate = value -> value %2 ==1;
        List<Integer> oddNumbers = filter(numbers, oddPredicate);
        System.out.println("oddNumbers = " + oddNumbers);
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers){
            boolean result = predicate.test(number);
            if (result){
                filtered.add(number);
            }
        }
        return filtered;
    }
}
