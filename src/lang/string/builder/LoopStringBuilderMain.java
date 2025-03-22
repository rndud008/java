package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        System.out.println(sb);
        System.out.println("time = " + (endTime - startTime) + "ms");

        // 반복문에서 반복해서 문자연결
        // 조건문을 통해 동적으로 문자열을 조합
        // 복잡한 문자열의 특정 부분을 변경해야 할때
        // 매우 긴 대용량 문자열을 다룰때

        // StringBuffer 는 내부 동기화가 되어 있어서 멀티스레드 상황에는 안전하지만 동기화 오버헤드로 인해 성능이 느리다
        // StringBuilder 는 멀티 스레드에 상황에 안전하지 않지만 동기화 오버헤드가 없으므로 속도가 빠르다.
    }
}
