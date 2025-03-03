package reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("reflection.data.BasicData");
        // 생성자는 상속이라는 개념이 없음.

        System.out.println("==== constructors() ====");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor: constructors){
            System.out.println("constructor = " + constructor);
            // 자신의 public 메소드 만 출력
        }

        System.out.println("==== declaredConstructors() ====");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors){
            System.out.println("declaredConstructor = " + constructor);
            // 자신의 모든 메소드 만 출력
        }
    }
}
