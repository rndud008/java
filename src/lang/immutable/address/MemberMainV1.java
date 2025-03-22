package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 memberA = new MemberV1("회원A",address);
        MemberV1 memberB = new MemberV1("회원B",address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를  부산으로 변경
        memberB.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // address의 참조값이 회원 A에도 있고, 회원B에 도 있다
        // B회원의 address 를 변경하면
        // A회원도 B회원의 address 참조값이 같기 때문 A 회원도 변경이 일어남.
    }
}
