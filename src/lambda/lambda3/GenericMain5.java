package lambda.lambda3;

public class GenericMain5 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = s -> s.toUpperCase();
        String hello = upperCase.apply("hello");
        System.out.println("hello = " + hello);

        GenericFunction<Integer, Integer> square = n -> n * n;
        Integer apply = square.apply(2);
        System.out.println("apply = " + apply);


    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
