package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": helloThread.start() 호출전");
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + ": helloThread.start() 호출후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

        // 스레드의 실행순서는 약간 다를수 있고 순서와 실행기간을 보장되지 않음.
//        main: main() start
//        main: helloThread.start() 호출전
//        main: helloThread.start() 호출후
//        main: main() end
//        Thread-0: run()

        // main 스레드는 start() 메서드를 통해 Thread-0 스레드에게 실행을 지시할뿐 main 스레드가 run()을 호출하는것이 아님.
    }
}
