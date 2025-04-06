package lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        // 대표적으로 객체생성, 값 반환 등 사용
        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(10);
            }
        };

        System.out.println("supplier1.get() = " + supplier1.get());

        Supplier<Integer> supplier2 = ()-> new Random().nextInt(10);
        System.out.println("supplier2.get() = " + supplier2.get());
    }
}
