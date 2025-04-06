package lambda.lambda4;

public class RunnableMain {
    public static void main(String[] args) {
        // 대표적으로 스레드 실행시 사용
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };
        runnable1.run();

        Runnable runnable2 = () -> System.out.println("Hello Runnable");
        runnable2.run();
    }
}
