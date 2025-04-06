package lamda.lamda1;

import lamda.MyFunction;
import lamda.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure = ()->{
            System.out.println("hello lambda");
        };

        procedure.run();

        //단일 표현식은 중괄호 생략 가능
        Procedure procedure2 = ()->System.out.println("hello lambda");
        procedure2.run();
    }
}
