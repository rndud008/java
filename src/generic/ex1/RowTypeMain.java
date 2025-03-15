package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
//        GenericBox<ObjectBox> integerBox = new GenericBox<>(); // 권장.
        //  다음과 같이 <>을 지정하지 않을수 있는데 이런것을 로타입(row type), 또는 원시타입이라 함.
        // 원시타입을 사용하면 내부의 타입 매개변수가 Object 로 사용됨.

        integerBox.setValue(10);
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);

    }
}
