package lamda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleEx1 {

    // 고차 함수, 함수르르 인자로 받아서 조건에 맞는 요소만 뽑아내는 filter
    public static List<Integer> filter(List<Integer> list, MyPredicate predicate){
        List<Integer> result = new ArrayList<>();
        for (int val: list){
            if (predicate.test(val)){
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3,-2,-1,1,2,3,5);
        System.out.println("원본 리스트: " + numbers);

        List<Integer> negatives = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });
        System.out.println("negatives = " + negatives);

        List<Integer> evens = filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });
        System.out.println("evens = " + evens);
    }
}
