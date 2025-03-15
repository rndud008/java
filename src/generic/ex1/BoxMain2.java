package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox  = new ObjectBox();
        integerBox.setValue(10);
        Object o = integerBox.getValue();
        Integer integer = (Integer) o; // Object 를 Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox  = new ObjectBox();
        stringBox.setValue("hello");
        String str = (String)  stringBox.getValue();// Object 를 String 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달
        integerBox.setValue("문자100");
        Integer result = (Integer) integerBox.getValue(); // String -> Integer 캐스팅 예외 발생. (ClassCastException)
        System.out.println("result = " + result);
    }
}
