package annotation.basic.inherited;

import java.lang.annotation.Annotation;

public class InheritedMain {
    public static void main(String[] args) {


        // 클래스 상속은 자식 클래스가 부모 클래스의 속성과 메서드를 상속받는 개념
        // 자식클래스는 부모클래스이 특성을 이어 받으므로 부모클래스에 정의된 애노테이션을 자식 클래스가 자동으로 상속 받을수 잇는 논리적 기반.
        print(Parent.class);
        print(Child.class);

        // 인터페이스는 메서드의 시그니처만 정의할뿐 상태나 행위를 가지지 않기 때문에 인터페이스의 구현체가 애노테이션을 상속한다는 개념은 잘 맞지 않음.
        // 인터페이스는 다중 구현이 가능,
        // 인터페이스의 애노테이션을 구현 클래스에서 상속하게 되면 여러 인터페이스의 애노테이션 간의 충돌이나 모호한 상황이 발생할수 있음.
        print(TestInterface.class);
        print(TestInterfaceImpl.class);
    }

    public static void print(Class<?> clazz){
        System.out.println("class = " + clazz);
        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation : annotations){
            System.out.println(" - " + annotation.annotationType().getSimpleName());
        }
    }
}
