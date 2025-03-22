package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유 할수 있다
        Address a = new Address("서울");
        Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // b값을 부산으로 변경해야함
        // RefMain1_1 과는 다르게 서로 다른 참조를 하기 때문에 문제가 발생하지 않음
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
