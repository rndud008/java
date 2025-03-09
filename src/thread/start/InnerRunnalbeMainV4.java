package thread.start;

import static util.MyLogger.log;

public class InnerRunnalbeMainV4 {

    public static void main(String[] args) {
        log("main start");

        Thread thread = new Thread(() -> log("run()"));

        thread.start();

        log("main() end");

        // 실행 결과는 다를수 있고 스레드의 실행순서는 보장되지 않는다.
    }


}
