package lang.object.tostring;

public class toStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("2. println 내부에서 toString 호출");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int hashCode = System.identityHashCode(dog1);
        System.out.println("hashCode = " + hashCode);

        String refValue = Integer.toHexString(hashCode);
        System.out.println("refValue = " + refValue);
        // dog1의 참조값.

    }
}
