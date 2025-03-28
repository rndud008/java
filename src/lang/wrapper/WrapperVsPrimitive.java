package lang.wrapper;

public class WrapperVsPrimitive {


    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive+= i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime - startTime) + "ms");

        //래퍼 클래스 Long 사용

        Long sumWarpper = 0l;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWarpper+= i;
        }

        endTime = System.currentTimeMillis();

        System.out.println("sumWarpper = " + sumWarpper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime - startTime) + "ms");

    }
}
