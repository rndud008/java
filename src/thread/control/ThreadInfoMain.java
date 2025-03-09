package thread.control;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        log("mainThread =  " + mainThread);
        log("mainThread.threadId() =  " + mainThread.threadId());
        log("mainThread.getName() =  " + mainThread.getName());
        log("mainThread.getPriority() =  " + mainThread.getPriority());
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());
        System.out.println();

        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread =  " + myThread);
        log("myThread.threadId() =  " + myThread.threadId());
        log("myThread.getName() =  " + myThread.getName());
        log("myThread.getPriority() =  " + myThread.getPriority()); // 스레드의 우선순위
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup());
        log("myThread.getState() = " + myThread.getState());

//        13:51:45.888 [     main] mainThread =  Thread[#1,main,5,main]
//        13:51:45.896 [     main] mainThread.threadId() =  1
//        13:51:45.897 [     main] mainThread.getName() =  main
//        13:51:45.901 [     main] mainThread.getPriority() =  5
//        13:51:45.901 [     main] mainThread.getThreadGroup() = java.lang.ThreadGroup[name=main,maxpri=10]
//        13:51:45.901 [     main] mainThread.getState() = RUNNABLE // 실행중이거나 실행가능한 상태
//
//        13:51:45.902 [     main] myThread =  Thread[#30,myThread,5,main]
//        13:51:45.903 [     main] myThread.threadId() =  30
//        13:51:45.903 [     main] myThread.getName() =  myThread
//        13:51:45.903 [     main] myThread.getPriority() =  5
//        13:51:45.903 [     main] myThread.getThreadGroup() = java.lang.ThreadGroup[name=main,maxpri=10]
//        13:51:45.904 [     main] myThread.getState() = NEW // 실행하지 않은 새로운 상태
    }


}
