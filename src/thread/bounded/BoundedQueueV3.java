package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BoundedQueueV3 implements BoundedQueue {

    // synchronized 와 함께 사용 할수 있는 wait(), notify(), notifyAll()을 사용해서 문제 해결
    // wait()을 사용하면 스레드가 대기할때 락을 반납하고 대기
    // notify()를 호출하면 스레드가 깨어나면서 락 획들을 시도
    // 락을 획득하면  RUNNABLE 상태가 되고 락을 획득하지 못하면 락 획득을 대기하는 BLOCKED 상태가 됨
    // 스레드를 제어하는 큐자료 구조를 만들수있음
    // 생산자 스레드는 버퍼가 가득차면 버퍼에 여유가 생길때 까지 대기
    // 소비자 스레드는 버퍼에 데이터가 없으면 버퍼에 데이터가 들어올때까지 대기
    // 이방식의 단점은 스레드가 대기하는 대기 집합이 하나이기때문에 원하는 스레드를 선택해서 깨울수 없는 문제가 있음
    // 생산자는 데이터를  생산한 다음 대기하는 소비자를 깨워야 하는데 대기 하는 생산자를 깨울수 있음
    // 비효율이 발생하고 로직은 모두 정상 작동.

    private final Queue<String> queue = new  ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == max){
            log("[put] 큐가 가득 참 생산자 대기");
            try {
                wait();
                // RUNNABLE -> WAITING, 락 반납.
                log("[put] 생산자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
        log("[put] 생산자 데이터 저장, notify() 호출");
        notify(); // 대기 스레드, WAIT -> BLOCKED
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()){
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            try {
                wait();
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        log("[take] 소비자 데이터 획득, notify() 호출");
        notify();// 대기 스레드, WAIT -> BLOCKED
        return data;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
