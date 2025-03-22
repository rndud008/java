package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유 할수 있다
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // b값을 부산으로 변경해야함
        // 주소값 을 복사했기 때문에 b값을 변경하면 a값도 같이 변경하게됨.
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 사이드 이펙트 발생.
        System.out.println("b = " + b);
    }
}
