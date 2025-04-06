package lambda.lambda3;

public class GenericMain4 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = new GenericFunction<>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String hello = upperCase.apply("hello");
        System.out.println("hello = " + hello);

        GenericFunction<Integer, Integer> square = new GenericFunction<>() {
            @Override
            public Integer apply(Integer n) {
                return n * n;
            }
        };
        Integer apply = square.apply(2);
        System.out.println("apply = " + apply);


    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }

}
