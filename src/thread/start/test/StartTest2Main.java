package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {

//        CouterRunnable couterRunnable = new CouterRunnable();
//        Thread thread = new Thread(couterRunnable);
//        thread.start();

        Thread thread = new Thread(new CouterRunnable(), "counter");
        thread.start();


    }

    static class CouterRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
