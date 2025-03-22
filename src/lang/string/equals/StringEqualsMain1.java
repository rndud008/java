package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));

//        new String() == 비교: false
//        new String() equals 비교: true
//        리터럴 == 비교: true
//        리터럴 equals 비교: true

        // 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용
        // 자바가 실행되는 시점에 클ㄹ래스에 문자열 리터럴이 잇으면 문자열 풀에 String 인스턴스를 미리 만들어둠 이때 같은 문자열이 있으면 만들지 않음
        // 문자열 리터럴을 사용하면 문자열 풀에서 hello 라는 문자를  가진 String 인스턴스를 찾고 찾은 str3 인스턴스의 참조를 반환
        // str4  의 경우 hello 문자열 리터럴을 사용하므로 문자열 풀에서 str3 와 같은 ckawhfmf tkdyd
        // 문자열 풀 덕분에 같은ㄴ 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 .
    }
}
