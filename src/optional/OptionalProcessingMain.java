package optional;

import java.util.Optional;
import java.util.OptionalInt;

public class OptionalProcessingMain {
    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 아무일도 하지 않음
        System.out.println("=== 1. ifPresent() ===");
        optValue.ifPresent(v -> System.out.println("optValue 값 : " + v));
        optEmpty.ifPresent(v -> System.out.println("optEmpty 값 : " + v)); // 실행 X

        // 값이 있으면 Consumer 실행, 없으면 Runnable 실행
        System.out.println("=== 2. ifPresentOfElse() ===");
        optValue.ifPresentOrElse(v -> System.out.println("optValue 값: " + v),
                () -> System.out.println("optValue는 비어있음")
                );

        optEmpty.ifPresentOrElse(v -> System.out.println("optEmpty 값: " + v),
                () -> System.out.println("optEmpty 비어있음")
        );

        // 값이 있으면 Function 적용 후 Optional로 반환, 없으면 Optional.empty()
        System.out.println("=== 3. map() ===");
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("optValue.map(String::length) = " + lengthOpt1);

        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("optEmpty.map(String::length) = " + lengthOpt2);

        // map()과 유사하나, 이미 Optional을 반환하는 경우 중첩을 제거
        System.out.println("=== 4. faltMap() ===");
        System.out.println("MAP");
        Optional<Optional<String>> nestedOpt = optValue.map(s -> Optional
                .of(s));
        System.out.println("optValue = " + optValue);
        System.out.println("nestedOpt = " + nestedOpt);

        // flatMap을 사용하면 한번에 평탄화
        System.out.println("FLAT_MAP");
        Optional<String> flattenedOpt = optValue.flatMap(s -> Optional
                .of(s));
        System.out.println("optValue = " + optValue);
        System.out.println("flattenedOpt = " + flattenedOpt);

        System.out.println("=== 5. filter() ===");
        // 값이 있고 조건을 만족하면 그 값을 그대로, 불만족시 Optional.empty()
        Optional<String> filtered1 = optValue.filter(s -> s.startsWith("H"));
        Optional<String> filtered2 = optEmpty.filter(s -> s.startsWith("X"));
        System.out.println("filtered1 = " + filtered1);
        System.out.println("filtered2 = " + filtered2);

        System.out.println(" === 6. stream() ===");
        // 값이 있으면 단일 요소 스트림, 없으면 빈 스트림
        optValue.stream()
                .forEach(s -> System.out.println("optValue.stream() -> " + s));

        // 값이 없으므로 실행이 안됨
        optEmpty.stream()
                .forEach(s -> System.out.println("optEmpty.stream() -> " + s));
    }
}
