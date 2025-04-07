package methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

// 매개변수 추가
public class MethodRefEx6 {
    public static void main(String[] args) {
        //4. 임의의 객체의 인스턴ㅅ느 메서드 참조(특정 타입의)
        Person person = new Person("Kim");

        //람다
        BiFunction<Person,Integer,String> fun1 = (Person p, Integer num) -> p.introduceWithNumber(num);

        System.out.println("fun1.apply(person,1) = " + fun1.apply(person,1));

        // 메서드 참조, 타입이 첫번째 매개변수가 됨, 그리고 첫번째 매개변수의 메서드를 호출
        BiFunction<Person,Integer,String> fun2 = Person::introduceWithNumber; // 타입:: 메서드명
        System.out.println("fun2.apply(person,1) = " + fun2.apply(person,1));
    }
}
