package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();

        sleep(1000);

        task.flag = false;
        log("task.flag = " + task.flag + ", task.count = " + task.count + " in main");
    }

    static class MyTask implements  Runnable{
//        boolean flag = true; // 캐시 메모리
//        long count ; // 캐시 메모리

        volatile boolean flag = true; // 메인 메모리
        volatile long count ; // 메인 메모리
        // volatile 을 사용하면 캐시메모리가 아니라 메인 메모리에 항상 직접 접근하기 때문에 성능이 상대적으로 떨어짐.
        // 꼭 필요한 경우에만 사용을 권장.

        @Override
        public void run() {
            while (flag){

                count ++;
                if (count % 100_000_000 == 0){
                    log("flag = " + flag + ", count = " + count +" in while()");
                    // 이때 컨텍스트 스위칭이 발생하면서 캐시 메모리 같은경우 갱신이 될수 있음.
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}
