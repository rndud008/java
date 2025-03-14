package thread.executor.future;

import java.util.Random;
import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class CallableMainV1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
//        ExecutorService es = Executors.newFixedThreadPool(1,1,0,TimeUnit.MICROSECONDS,new LinkedBlockingDeque<>()); // 위와 동일.

        Future<Integer> future = es.submit(new MyCallable());
        Integer result = future.get();

//        Integer result2 = es.submit(new MyCallable()).get(); // result 와 동일.

        log("result value = " + result);
        es.close();
    }

    static class MyCallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            log("Callable 시작");
            sleep(2000);
            int value = new Random().nextInt(10);
            log("value = " + value);
            log("Callable 완료");

            return value;
        }
    }
}
