package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다

        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        // 환경변수를 읽는다
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다
        System.out.println("System.getProperties() = " + System.getProperties());
        ;
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        //배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("출력 안됨");
    }
}
