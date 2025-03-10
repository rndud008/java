package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BoundedQueueV2 implements BoundedQueue {
    // 반복문을 사용해서 스레드를 대기하는 방법을 적용
    // synchronized 임계영역 안에서 락을 드고 대기하기 때문에 다른 스레드가 임계영역에 접근할수 없는 문제 발생
    // 스레드는 모두 blocked  상태가 되고 자바 스레드 세상이 멈추는 문제가 발생.

    private final Queue<String> queue = new  ArrayDeque<>();
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == max){
            log("[put] 큐가 가득 참 생산자 대기");
            sleep(1000);
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()){
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            sleep(1000);
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
