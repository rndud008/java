package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교1: " + isSame(str1 , str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교2: " + isSame(str3 , str4));


    }

    private static boolean isSame(String x, String y){
//        return x == y;
        return x.equals(y);
        // 매개 변수로 넘어오는 String 의 인스턴스가 new String() 으로 만들어진건지 , 문자열 리터럴로 만들어진것인지 확인할수 있는 방법이 없음.
        // 그러므로 문자열 비교는 항상 eqauls 를 사용해서 동등성 비교.
    }
}
