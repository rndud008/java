package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV4 {

//    static final int TASK_SIZE = 1100; // 1. 일반
    static final int TASK_SIZE = 1200; // 2. 긴급
//    static final int TASK_SIZE = 1201; // 3. 거절
    public static void main(String[] args) {

        ExecutorService es = new ThreadPoolExecutor(100, 200,
                                      60, TimeUnit.SECONDS,
                                      new ArrayBlockingQueue<>(1000));

        log("pool 생성");
        printState(es);

        long startMs = System.currentTimeMillis();
        for (int i = 1; i <= TASK_SIZE; i++) {
            String taskName = "taks" + i;
            try {
                es.execute(new RunnableTask(taskName));
                printState(es,taskName);
            }catch (RejectedExecutionException e){
                log("거절 -> " + e);
            }
        }

        es.close();
        long endMs = System.currentTimeMillis();
        log("== shutdown 완료 ==");
        log("entTime =  " + (endMs-startMs));

        // 사용자 정의
        // 기본 스레드 100개 , 추가 투입으로 100개 추가해서 max pool 200개
        // 최대 queue 1000개 설정.

        // 큐가 가득차면 거절.


    }
}
