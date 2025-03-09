package thread.sync.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx {
    // 비공정 모드 락
    private final Lock nonFairLock = new ReentrantLock();
    // 공정 모드 락
    private final Lock fairLock = new ReentrantLock(true);


    public void nonFairLockTest(){
        nonFairLock.lock();
        try {
            System.out.println();
            // 이 모드에서는 락을 먼저 요첳나 스레드가 먼저 락을 호기득한다는 보장이 없음.
        }finally {
            nonFairLock.unlock();
        }
    }

    public void fairLockTest(){
        fairLock.lock();
        try {
            System.out.println();
            // 이모드에서는 락을 요청한 순서대로 스레드가 락을 획들할수 있게 한다.
            // 성능 저하가 있음.
        }finally {
            fairLock.unlock();
        }
    }
}
