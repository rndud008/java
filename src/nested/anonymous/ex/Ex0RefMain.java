package nested.anonymous.ex;

public class Ex0RefMain {

    public static void helloJava(){
        System.out.println("프로그램 시작");
        System.out.println("Hello Java");
        System.out.println("프로그램 종료");
    }
    public static void hello(String value){
        System.out.println("프로그램 시작");
        System.out.println(value);
        System.out.println("프로그램 종료");
    }

    public static void helloSpring(){
        System.out.println("프로그램 시작");
        System.out.println("Hello Spring");
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloJava();
        helloSpring();
        hello("Hello Java");
        hello("Hello Spring");
    }
}
