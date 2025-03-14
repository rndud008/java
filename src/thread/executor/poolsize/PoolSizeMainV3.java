package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV3 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();

//        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                60L, TimeUnit.SECONDS,
//                new SynchronousQueue<Runnable>());

//        ExecutorService es = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                                      3L, TimeUnit.SECONDS,
//                                      new SynchronousQueue<Runnable>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskName = "taks" + i;
            es.execute(new RunnableTask(taskName));
            printState(es,taskName);
        }

        sleep(3000);
        log("== 작업 수행 완료 ==");
        printState(es);

        sleep(3000);
        log("== maximumPoolSize 대기시간 초과 == ");
        printState(es);

        es.close();
        log("== shutdown 완료 ==");

        // 캐시 스레드 풀 전략은 매우 빠르고 유연한 전략
        // 이 전략은 기본 스레드도 없고, 대기 큐에 작업도 쌓이지 않는다
        // 대신에 작업 요청이 오면 초과 스레드로 작업을 바로바로 처리
        // 따라서 빠른 처리가 가능하고 초과 스레드의 수도 제한이 없기 때문에 cpu 메모리 자원만 허용한다면 시스템 자원을 최대로 사용
        // 추가로 초과 스레드는 60초간 생존 하기 때문에 작업 수에 맞추어 적절한 수의 스레드가 재사용
        // 이런 특징 때문에 요청이 갑자기 증가하면 스레드도 갑자기 증가하고 요청이 줄어들면 스레드도 점점 줄어듬
        // 이전 략은 작업의 요청수에 따라서 스레드도 증가하고 감소하므로 매우 유연한 전략.

        // 점진적인 사용자 확대
        // 개발한 서비스가 잘되어 사용자가 점점늘어남
        // 캐시 스레드 전략을 사요하면 이런 경우 크게 문제 되지 않음
        // 캐시 스레드 전략은 이런 경우에는 문제를 빠르게 찾음
        // 사용자가 점점 증가함녀서 스레드 사용량도 함께 늘어남
        // 따라서 CPU 메모리 사용량도 자연스럽게 증가
        // CPU, 메모리 자원은 한계가 있기 때문에 적절한 시점에 시슴템을 증설해야 한다.
        // 그렇지 않으면 CPU, 메모리 같은 시스템 자원을 너무 많이 사용하면서 시스템이 다운될 수 있음

        // 갑작스런 요청 증가
        // 마케팀 팀의 이벤트가 대성공 함녀서 갑자기 사용자 폭증
        // 고객 응답을 받지 못한다고 항의

        // CPU사용량 100%  이고 메모리 사용량도 지나치게 높아져 잇음
        // 캐시 스레드 풀 전략은 스레드가 무한으로 생성 될수 있음
        // 시스템은 너무 많은 스레드에 잠식 당해서 거의 다운 됨


    }
}
