package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // 동일성 비교
        System.out.println("identity = " + (user1 == user2));

        // 동등성 비교.
        System.out.println("identity = " + user1.equals(user2));
    }
}
