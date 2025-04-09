package parallel;

import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ParallelMain1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        int sum = IntStream.rangeClosed(1, 8)
//                .map(i -> HeavyJob.heavyTask(i))
//                .reduce(0, (a, b) -> a + b);

        int sum = IntStream.rangeClosed(1, 8)
                .map(HeavyJob::heavyTask)
                .reduce(0, (a, b) -> a + b);

        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);
    }
}
