package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static thread.executor.ExecutorUtils.printState;
import static util.ThreadUtils.sleep;

public class PreStartPoolMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);
        printState(es);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor) es;
        poolExecutor.prestartAllCoreThreads();
        sleep(100);
        printState(es);
    }

    // newSingleThreadPool(): 단일 스레드 풀전략
    // 스레드 풀에 기본 스레드 1개만 사용
    // 큐 사이즈에 제한이 없다.(LinkedBlockingQueue)
    // 주로 간단히 사용하거나, 테스트 용도로 사용한다.

    //newFixedThreadPool(nThreads) : 고정풀 전략
    // 스레드풀에  nThreads 만큼의 기본 스레드를 생성한다. 초과 스레드
}
