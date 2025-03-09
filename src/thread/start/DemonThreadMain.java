package thread.start;

public class DemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(false); // 데몬스레드 여부 - 기본 값 false

        System.out.println(Thread.currentThread().getName() + ": demonThread.start() start");
        demonThread.start();
        System.out.println(Thread.currentThread().getName() + ": demonThread.start() end");

        System.out.println(Thread.currentThread().getName() + ": main() end");

//        demonThread.setDaemon(false); // 데몬스레드 여부 - 기본 값 false 일경우

//        main: main() start
//        main: demonThread.start() start
//        main: demonThread.start() end
//        main: main() end
//        Thread-0: run() start
//        Thread-0: run() end


//        demonThread.setDaemon(true); //

//        main: main() start
//        main: demonThread.start() start
//        main: demonThread.start() end
//        main: main() end
//        Thread-0: run() start

    }

    static class DemonThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() start");

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");

        }
    }
}
