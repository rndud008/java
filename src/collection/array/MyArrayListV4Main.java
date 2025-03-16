package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> list = new MyArrayListV4<>();
        System.out.println("== 데이터 추가 ==");
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        String string = list.get(0);
        System.out.println("string = " + string);

        MyArrayListV4<Integer> integerMyArrayListV4 = new MyArrayListV4<>();
        integerMyArrayListV4.add(1);
        integerMyArrayListV4.add(2);
        integerMyArrayListV4.add(3);
        Integer i = integerMyArrayListV4.get(0);
        System.out.println("i = " + i);



    }
}
