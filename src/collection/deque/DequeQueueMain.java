package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {
    public static void main(String[] args) {
        Deque<Integer>deque = new ArrayDeque<>();

        // 데이터 추가
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println("deque = " + deque);

        // 다음 꺼낼 데이 토학인(꺼내지 않고 단순 조히만)
        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque = " + deque);

//        deque = [1, 2, 3]
//        deque.peek() = 1
//        deque.poll() = 1
//        deque.poll() = 2
//        deque.poll() = 3
//        deque = []
    }
}
