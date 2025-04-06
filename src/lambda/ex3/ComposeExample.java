package lambda.ex3;

import java.util.function.Function;

public class ComposeExample {
    public static void main(String[] args) {
        Function<String,String> toUpper = s -> s.toUpperCase();

        Function<String,String> addDeco = s -> "**" + s + "**";

        Function<String,String> composeFunc = compose(toUpper,addDeco);

        String s = composeFunc.apply("java");
        System.out.println("s = " + s);
    }

    private static Function<String,String> compose(Function<String,String> toUpper, Function<String,String> addDeco) {

        return s -> addDeco.apply(toUpper.apply(s));
    }
}
