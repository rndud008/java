package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        // 생성 시점에 T의 타입 결정
        integerBox.setValue(10);
//        integerBox.setValue("문자100");//Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.getValue();
        System.out.println("integer = " + integer);


        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println("str = " + str);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.setValue(123.123);
        Double dou = doubleBox.getValue();
        System.out.println("dou = " + dou);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
//        GenericBox<> integerGenericBox = new GenericBox<Integer>(); // 문법상 맞지 않음 잘못된 방법.

        // 메서드는 매개변수에 인자를 전달해서 사용할 값을 정함
        // 제네릭 클래스는 타입매개변수에 타입 인자를 전달해서 사용할 타입을 정함.

        // 제네릭 타입 명명 관례.
        // 타입 매개변수는 일반적으로 대문자를 사용하고 용도에 맞는 단어의 첫글자를 사용함
        // E - Element
        // K - Key
        // N - Number
        // T - Type
        // V - Value
        // S,U,V.etc. - 2nd, 3rd, 4th types

        // 타입인자로 기본형은 프리미티브 타입..? 은 사용할수 없음.


    }
}
