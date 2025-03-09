package thread.start;

import static util.MyLogger.log;

public class ManyThreadMainV1 {

    public static void main(String[] args) {
        log("main start");

        HelloRunnable helloRunnable = new HelloRunnable();

//        Thread thread1 = new Thread(helloRunnable);
//        thread1.start();
//        Thread thread2 = new Thread(helloRunnable);
//        thread2.start();
//        Thread thread3 = new Thread(helloRunnable);
//        thread3.start();

        log("main() end");

        // 실행 결과는 다를수 있고 스레드의 실행순서는 보장되지 않는다.
    }

}
