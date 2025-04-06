package lambda.lambda1;

public class LambdaSimple4 {
    public static void main(String[] args) {
       MyCall call = (int value)-> value*2; // 기본
       MyCall call1 = ( value)-> value*2; // 타입 추론
       MyCall call2 =  value-> value*2; // 매개변수 1개, () 생략 가능

        System.out.println("call2 = " + call2.call(10));

    }
    interface MyCall{
        int call(int value);
    }
}
