package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": helloThread.start() 호출전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + ": helloThread.start() 호출후");

        System.out.println(Thread.currentThread().getName() + ": main() end");

//        main: main() start
//        main: helloThread.start() 호출전
//        main: run()
//        main: helloThread.start() 호출후
//        main: main() end

        //  main 스레드가 run() 메서드를 호출한것.
        // 스레드 start() 메서드는 스레드에 스택 공간을 할당하면서 스레드를 시작하는 아주 특별한 메서드
        // 그리고 해당 스레드 에서 run() 메서드를 실행
    }
}
