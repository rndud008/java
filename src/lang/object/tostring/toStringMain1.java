package lang.object.tostring;

public class toStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);

        // Object toString 은 해당객체의 패키지와 참조값을 출력.
    }
}
