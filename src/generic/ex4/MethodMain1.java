package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object o = GenericMethod.objMethod(i);
        Integer objectValue = (Integer) o;

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.2);

        // 타입추론.
        System.out.println("타입 추론.");
        // 타입인자를 전달 안하는것처럼 보이자만 전달함.
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.2);

        // 제네릭 메서드는 인스턴스 메서드와 static 메서드에 모두 적용 가능.

        // 제네릭 타입은 static 메서드에 타입 매개변수를 사용할 수 없음.
        // 제네릭 타입은 객체를 생성하는 시점에 타입이 정해짐
        // static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과 무관
        // static 메서드에 제네릭을 도입하려면 제네릭 메서드를 사용해야함.

        String s =  GenericMethod.<String>genericMethod("hello");
//        String s2 = GenericMethod.<Integer>numberMethod("hello"); // number 타입으로 제한하여 컴파일오류 발생.
    }
}
