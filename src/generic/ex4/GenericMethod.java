package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object o){
        System.out.println("o print= " + o);
        return o;
    }

    public static <T> T genericMethod(T o){
        // 해당 메서드에만 제네릭 적용,
        // 제네릭 메서드는 <> 제네릭 타입을 선언하고 원하는 타입 선언하면 됨.
        System.out.println("o print= " + o);
        return o;
    }

    public static <T extends Number> T numberMethod(T o){
        // 해당 메서드에만 제네릭 적용,
        // 제네릭 메서드는 <> 제네릭 타입을 선언하고 Number 타입으로 제한. 원하는 타입 선언하면 됨.
        System.out.println("o print= " + o);
        return o;
    }
}
