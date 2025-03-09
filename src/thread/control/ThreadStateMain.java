package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {


        Thread myThread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1 = " + myThread.getState());
        log("myThread.start()");
        myThread.start();
        Thread.sleep(1000);
        log("myThread.state3 = " + myThread.getState());
        Thread.sleep(4000);
        log("myThread.state5 = " + myThread.getState());
        log("end");

//        16:48:40.729 [     main] myThread.state1 = NEW // myThread 의 객체를 생성하고 start()를 호출하지 않은 상태
//        16:48:40.733 [     main] myThread.start()
//        16:48:40.733 [ myThread] start
//        16:48:40.734 [ myThread] myThread.state2 = RUNNABLE // myThread.start()를 호출하여 실행 상태
//        16:48:41.735 [     main] myThread.state3 = TIMED_WAITING // Thread.sleep(3000) 호출로 3초간 대기하면서 TIMED_WAITING 상태로 변환.
//        16:48:43.736 [ myThread] sleep() end
//        16:48:43.736 [ myThread] myThread.state4 = RUNNABLE // TIMED_WAITING 상태에서 빠져나와 RUNNABLE 상태로 변환
//        16:48:45.736 [     main] myThread.state5 = TERMINATED // myThread 가 run() 메서드를 실행종료하고 나면 TERMINATED 상태
//        16:48:45.736 [     main] end
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {

            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState());
                Thread.sleep(3000);
                log("sleep() end" );
                log("myThread.state4 = " + Thread.currentThread().getState());
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
