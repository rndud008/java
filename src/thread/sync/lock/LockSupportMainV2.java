package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class LockSupportMainV2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        // 잠시 대기하여 Thread-1이 park 상태에 빠질 시간을 준다.
        sleep(100);
        log("Thread-1 state: " + thread1.getState());

/*

        23:39:22.534 [ Thread-1] park 시작
        23:39:22.616 [     main] Thread-1 state: TIMED_WAITING
        23:39:24.538 [ Thread-1] park 종료, state: RUNNABLE
        23:39:24.542 [ Thread-1] 인터럽트 상태: false

*/

    }

    static class ParkTest implements Runnable{
        @Override
        public void run() {
            log("park 시작");
            LockSupport.parkNanos(2000_000000); // parkNanos  사용
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}
