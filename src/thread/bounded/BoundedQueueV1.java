package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue {
    // 단순한 큐 자료 구조
    // 스레드르르 제어 할수 없기 때문에 버퍼가 가득차거나 버퍼에 데이터가 없는 한정된 버퍼 상황에서 문제 발생


    private final Queue<String> queue = new  ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if (queue.size() == max){
            log("[put] 큐가 가득 참, 버림: " +data);
            // 버퍼가 가득 찬경우 생산자 데이터를 버린다.
            return;
        }
        queue.offer(data);

    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()){
            // 버퍼에 데이터가 없는 경우 소비자는 데이터를 획들 할수 없음.
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
