package parallel;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMain7 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService requestPool = Executors.newFixedThreadPool(100);
        ExecutorService logicPool = Executors.newFixedThreadPool(400);
        int nThreads = 3;

        for (int i = 1; i <= nThreads ; i++) {
            String requestName = "request" + i;
            requestPool.submit(() -> logic(requestName, logicPool));
            Thread.sleep(100);
        }
        requestPool.close();
        logicPool.close();

    }

    private static void logic(String requestName, ExecutorService es)  {
        log("["+requestName + "] START");
        long startTime = System.currentTimeMillis();

        List<Future<Integer>> list = IntStream.rangeClosed(1, 4)
                .mapToObj(i -> es.submit(() -> HeavyJob.heavyTask(1, requestName)))
                .toList();

        int sum = list.stream()
                .mapToInt(f -> {
                    try {
                        return f.get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                }).sum();

        long endTime = System.currentTimeMillis();
        log("["+requestName +"] time: " + (endTime - startTime) + "ms, sum: " + sum);
    }

}
