package lambda.lambda3;

import java.util.function.Function;

// 자바가 기본으로 제공하는 Function 사용
public class TargetType2 {
    public static void main(String[] args) {
        Function<String,String > uppercase = s -> s.toUpperCase();
        String hello = uppercase.apply("hello");
        System.out.println("hello = " + hello);

        Function<Integer, Integer> square = n -> n * n;
        Integer apply = square.apply(3);
        System.out.println("apply = " + apply);
    }

}
