package lamda.lambda2;

import lamda.MyFunction;

// 1. 람다를 메서드(함수)에 전달하기
public class LambdaPassMain2 {
    public static void main(String[] args) {
        MyFunction add = (a,b) -> a+b;
        MyFunction sub = (a,b) -> a-b;

        System.out.println("변수를 통해 전달");
        calculate(add);
        calculate(sub);

        System.out.println("람다를 진접 전달");
        calculate((a,b) -> a+b);
        calculate((a,b)-> a-b);
    }
    static void calculate(MyFunction function){
        int a = 1;
        int b = 2;
        System.out.println("계산 시작");
        int result = function.apply(a,b);
        System.out.println("result = " + result);
    }
}
