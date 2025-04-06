package lambda.ex2;

public class BuildGreeterExample {
    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting){

        return s -> greeting + ", " + s;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("Hello");
        StringFunction hiGreeter = buildGreeter("hi");
        String java = helloGreeter.apply("Java");
        String lambda = hiGreeter.apply("Lambda");

        System.out.println("java = " + java);
        System.out.println("lambda = " + lambda);
    }
}
