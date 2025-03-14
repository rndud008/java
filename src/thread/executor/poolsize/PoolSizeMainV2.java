package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
//        ArrayBlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(2);
        ExecutorService es = Executors.newFixedThreadPool(2);
//        ExecutorService es = new ThreadPoolExecutor(2, nThreads, 0l, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskName = "taks" + i;
            es.execute(new RunnableTask(taskName));
            printState(es,taskName);
        }
        es.close();
        log("== shutdown 완료 == ");

        // 스레드 수가 고정되어 잇기 때문에 CPU, 메모리 리소스가 어느정도 예측 가능한 안정적인 방식
        // 큐 사이즈도 제한이 없어서 작업을 많이 담아두어도 문제 없음

        // 상황에 따라 장점이 가장 큰 단점 이 되기도 함.

        // 점진적인 사용자 확대
        // 개발한 서비스가 잘되어서 사용자가 점점 늘어나낟
        // 고정 스레드 전략을 사용해서 서비스를 안정적으로 잘 운영했는데, 언젠가부터 사용자들이 서비스 응답이 점점 느려진다고 항의

        // 갑작스런 요청 증가
        // 마케팅 팀의 이벤트가 대성공 하면서 갑자기 사용자 폭증
        // 고객은 응답을 받지 못한다고 항의

    }
}
