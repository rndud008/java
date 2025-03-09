package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        // 잠시 대기하여 Thread-1이 park 상태에 빠질 시간을 준다.
        sleep(100);
        log("Thread-1 state: " + thread1.getState());

        log("main -> unpark(Thread-1)");
        LockSupport.unpark(thread1); // unpark 사용
//        thread1.interrupt();
        /*
        LockSupport.unpark(thread1);
        23:33:56.069 [ Thread-1] park 시작
        23:33:56.152 [     main] Thread-1 state: WAITING // LockSupport.park()호출로 WAITING 변경
        23:33:56.152 [     main] main -> unpark(Thread-1
        23:33:56.153 [ Thread-1] park 종료, state: RUNNABLE //  LockSupport.unpark(thread1) 호출로 RUNNABLE 변경
        23:33:56.156 [ Thread-1] 인터럽트 상태: false
        */

        /*
        thread1.interrupt();
        23:36:56.943 [ Thread-1] park 시작
        23:36:57.027 [     main] Thread-1 state: WAITING
        23:36:57.028 [     main] main -> unpark(Thread-1)
        23:36:57.028 [ Thread-1] park 종료, state: RUNNABLE
        23:36:57.033 [ Thread-1] 인터럽트 상태: true
         */
    }

    static class ParkTest implements Runnable{
        @Override
        public void run() {
            log("park 시작");
            LockSupport.park();
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}
