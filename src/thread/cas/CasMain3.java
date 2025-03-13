package thread.cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CasMain3 {

    private static int THREAD_COUNT =2;
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        System.out.println("start value = " + atomicInteger.get());

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                incrementAndGet(atomicInteger);
            }
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread: threads){
            thread.join();
        }

        int result = atomicInteger.get();

        System.out.println(atomicInteger.getClass().getSimpleName() + " result = " + result);
    }

    private static int incrementAndGet(AtomicInteger atomicInteger) {
        int getValue;
        boolean result;
        do{
            getValue = atomicInteger.get(); // thread1: 0
            sleep(100); // 스레드 동시 실행을 위한 대기
            log("getValue : " + getValue);
            // thread2 value -> 1
            result = atomicInteger.compareAndSet(getValue, getValue + 1);
            log("result : " + result);
        }while (!result);

//        return atomicInteger.get(); // 다른스레드가 값을 변경할수 있음.
        return getValue +1;
    }
}
