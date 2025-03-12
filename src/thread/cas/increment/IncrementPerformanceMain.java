package thread.cas.increment;

public class IncrementPerformanceMain {
    public static final long COUNT = 100_000_000;

    public static void main(String[] args) {
        test(new BasicInteger());
        // 가장빠름
        // CPU 캐시를 적극 사용, CPU 캐시의 위력을 알수 있음
        // 안전한 임계영역도 없고 volatile도 사용하지 않기 때문에 멀티 스레드 상황에는 사용할수 없음
        // 단일 스레드가 사용하는 경우에 효율적

        test(new VolatileInteger());
        // volatile을 사용해서 cput캐시를 사용하지 않고 메인 메모리를 사용
        // 안전한 임계 영역이 없기 때문에 멀티스레드 상황에는 사용할수 없음
        // 단일 스레드가 사용하기에는 BasciInteger ㅂ돠 느리다. 그리고 멀티스레드 상황에도 안전하지 않음

        test(new SyncInteger());
        // Synchronized 사용한 안전한 임계영역이 있기 때문에  멀티스레드 상황에도 안전하게 사용할수 있음
        // MyAtomicInteger 보다 성능이 느림

        test(new MyAtomicInteger());
        // 자바가 제공하는 AtomicInteger를 사용 , 멀티스레드 상황에 안전하게 사용
        // 성능도 synchronized, Lock(ReentrantLock) 을 사용하는 경우보다 1.5 ~ 2배 정도 빠름
        // 락을 사용하지 않고 원자적 연산을 함.
    }

    private static void test(IncrementInteger incrementInteger) {
        long startMs = System.currentTimeMillis();

        for (long i = 0; i < COUNT; i++) {

            incrementInteger.increment();
        }

        long endMs = System.currentTimeMillis();

        System.out.println(incrementInteger.getClass().getSimpleName() + ": ms= " + (endMs - startMs));
    }
}
