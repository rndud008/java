package parallel.forkjoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static util.MyLogger.log;

public class CompletableFutureMain {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> log("Folk.Join")); // Fork/Join 공용풀 - CPU 작업

        Thread.sleep(1000);
        ExecutorService es = Executors.newFixedThreadPool(100);
        CompletableFuture.runAsync(() -> log("Custom pool"),es); // 별도의 풀 - I/O 작업
        es.close();
    }
}
