package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
       String str = "Hello Java";

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed = " + reversed);


    }
}

