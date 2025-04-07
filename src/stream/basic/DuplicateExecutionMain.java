package stream.basic;

import java.util.List;
import java.util.stream.Stream;

public class DuplicateExecutionMain {
    public static void main(String[] args) {
        // 스트림 중복 실행 확인
        Stream<Integer> stream = Stream.of(1, 2, 3);
        stream.forEach(System.out::println); // 1. 최조 실행

        // 오류 메시지
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        // stream.forEach(System.out::println); // 2. 스트림 중복 실행 X, 주석 풀고 실행하면 예외 발생

        // 대안: 대상 리스트를 스트림으로 새로 성생해서 사용
        List<Integer> list = List.of(1,2,3);
        Stream.of(list).forEach(System.out::println);
        Stream.of(list).forEach(System.out::println);
    }
}
