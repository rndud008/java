package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");

        System.out.println("str = " + str);

        String str2 = str.concat(" java");
        System.out.println("str2 = " + str2);

        // String 은 불변객체여서 concat을 사용하게되면 객체를 대입 받아야 한다.?
    }

}
