package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str1 = "100";

        // String -> Integer
        Integer integer = Integer.valueOf(str1);
        System.out.println("integer = " + integer);

        // Integer -> int
        int intValue = integer;
        System.out.println("intValue = " + intValue);

        // int -> Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);


    }
}
