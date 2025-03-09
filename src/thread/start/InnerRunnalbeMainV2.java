package thread.start;

import static util.MyLogger.log;

public class InnerRunnalbeMainV2 {

    public static void main(String[] args) {
        log("main start");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");

        // 실행 결과는 다를수 있고 스레드의 실행순서는 보장되지 않는다.
    }


}
