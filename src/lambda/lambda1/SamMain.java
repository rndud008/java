package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = ()->{
            System.out.println("sam");
        };
        samInterface.run();
        // 컴파일 오류
//        NotSamInterface notSamInterface = ()->{
//            System.out.println("not sam");
//        };
        // 람다를 인터페에스에 담으려면 하나의 메서드만 선언되어 있어야 한다.
    }
}
