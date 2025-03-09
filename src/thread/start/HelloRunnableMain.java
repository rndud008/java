package thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        // 실행 결과는 기존과 동일
        // 차이가 있다면 스레드와 해당 스레드가 실행할 작업이 서로 분리 되어 잇음.

        // Thread 상속방식
        // 장점
        // 간단한 구현 : Thread 클래스를 상속받아 run() 메서드만 재정의
        // 단점
        // 상속의 제한 : 자바는 단일 상속만을 허용하므로 이미 다른 클래스를 상속받고 잇는 경우 Thread 클래스를 상속받을수 없음
        // 유연성 부족: 인터페이스를 사용하는 방법에 비해 유연성이 떨어짐.

        // Runnable 인터페이스 구현방식
        // 장점
        // 상속의 자유로움 : Runnable 인터페이스 방식은 다른 클래스를 상속 받아도 문제없이 구현
        // 코드의 분리 : 스레드와 실행할 작업을 분리하여 코드의 가독성을 높임
        // 여러 스레드가 동일한 Runnable 객체를 공유할수 있어 자원 관리에 효율적
        // 단점
        // 코드가 약간 복잡해 질수 잇음 Runnable 객체를 생성하고 이를 Thread에 전달하는 과정이 추가.

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

}
