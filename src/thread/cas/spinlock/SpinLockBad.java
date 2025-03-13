package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockBad {
    private volatile boolean lock = false;

    public void lock() {
        log("락 획득 시도");
        while (true) {
            if (!lock) {
                //1. 락 사용 여부 확인
                sleep(100); // 문제상황 확인용, 스레드 대기

                lock = true; // 2. 락의 값 변경
                break;

                // 지금 1.번 과 2.번 연산이 하나의 연산 이 아니기 때문에 문제가 발생.
            } else {
                // 락을 획득할 때 까지 스핀 대기(바쁜대기) 한다.
                log("락 획득 실패 - 스핀 대기");
            }
        }
        log("락 획득 완료");
    }

    public void  unlock(){
        lock = false; // 원자적인 연산.
        log("락 반납 완료");
    }

}
