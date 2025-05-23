package lambda.lambda2;

import lambda.MyFunction;

// 1. 람다를 메서드(함수)에 전달하기
public class LambdaPassMain3 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1,2) = " + add.apply(1, 2));

        MyFunction sub = getOperation("sub");
        System.out.println("sub.apply(1,2) = " + sub.apply(1, 2));

        MyFunction xxxx = getOperation("xxxx");
        System.out.println("xxxx.apply(1,2) = " + xxxx.apply(1, 2));
    }
    static MyFunction getOperation(String operator){
       switch (operator){
           case "add":
               return (a,b)->a+b;
           case "sub":
               return (a,b)->a-b;
           default:
               return (a,b)->0;
       }
    }
}
