package thread.cas;

import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV1 {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        System.out.println("start value = " + atomicInteger.get());

        boolean result1 = atomicInteger.compareAndSet(0,1);
        System.out.println("result1 = " + result1 + ", value = " + atomicInteger.get());
        // 비교해 보고 값이 일치하면 변경.

        boolean result2 = atomicInteger.compareAndSet(0,1);
        System.out.println("result2 = " + result2 + ", value = " + atomicInteger.get());
        // 비교해 보고 값이 일치하지 않아서 변경하지 못함.

    }
}
