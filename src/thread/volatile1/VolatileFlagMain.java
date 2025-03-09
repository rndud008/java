package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag를 false 변경 시도");
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {

//        boolean runFlag = true; // 캐시 메모리에만 적용 되고 메인메모리에는 언제 적용될지 모르고 적용되지 않을수도 잇음.
        volatile boolean runFlag = true; // 캐시메모리를 사용하지 않고 값을 읽거나 쓸때 항상 메인 메모리에 직접 접근.

        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {

            }
            log("task 종료");
        }
    }
}
