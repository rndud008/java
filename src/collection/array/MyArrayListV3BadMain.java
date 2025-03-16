package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();
        System.out.println("== 데이터 추가 ==");
        System.out.println(numberList);
        numberList.add(1);

        System.out.println(numberList);
        numberList.add(2);

        System.out.println(numberList);
        numberList.add("문자c");

       // Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numberList.get(0);
        Integer num2 = (Integer) numberList.get(1);

        //Exception in thread "main" java.lang.ClassCastException 발생. 문자를 Integer로 캐스팅.
        Integer num3 = (Integer) numberList.get(2);

    }
}
