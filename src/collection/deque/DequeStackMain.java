package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer>deque = new ArrayDeque<>();

        // 데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("deque = " + deque);

        // 다음 꺼낼 데이 토학인(꺼내지 않고 단순 조히만)
        System.out.println("deque.peek() = " + deque.peek());

        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque = " + deque);

//        deque = [3, 2, 1]
//        deque.peek() = 3
//        deque.pop() = 3
//        deque.pop() = 2
//        deque.pop() = 1
//        deque = []
    }
}
