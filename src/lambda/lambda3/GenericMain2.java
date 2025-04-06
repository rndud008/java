package lambda.lambda3;

public class GenericMain2 {
    public static void main(String[] args) {
        ObjectFunction upperCase= s -> ((String) s).toUpperCase();
        String hello = (String) upperCase.apply("hello");
        System.out.println("hello = " + hello);

        ObjectFunction square = n -> (Integer) n * (Integer) n;
        Integer apply = (Integer) square.apply(2);
        System.out.println("apply = " + apply);


    }
    @FunctionalInterface
    interface  ObjectFunction{
        Object apply(Object s);
    }

}
