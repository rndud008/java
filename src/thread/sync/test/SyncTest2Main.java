package thread.sync.test;

import static util.MyLogger.log;

public class SyncTest2Main {
    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                myCounter.count();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();

    }

    static class MyCounter{
        public void count(){
            int localValue = 0;
            // localValue 는 지역번수
            // 스택영역은 각가의 스레드가 가지는 별도의 메모리공간 이므로 다른스레드와 공유하지 않는다
            // 지역변수는 스레드의 개별 저장 공간인 스택영역에 생성되므로 다른 스레드와 공유되지 않는다.
            for (int i = 0; i < 1000; i++) {
                localValue++;
            }
            log("결과: " + localValue);
        }
    }
}
