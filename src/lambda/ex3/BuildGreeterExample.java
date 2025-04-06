package lambda.ex3;

import java.util.function.Function;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static Function<String,String> buildGreeter(String greeting){

        return s -> greeting + ", " + s;
    }

    public static void main(String[] args) {
        Function<String,String> helloGreeter = buildGreeter("Hello");
        Function<String,String> hiGreeter = buildGreeter("hi");
        String java = helloGreeter.apply("Java");
        String lambda = hiGreeter.apply("Lambda");

        System.out.println("java = " + java);
        System.out.println("lambda = " + lambda);
    }
}
