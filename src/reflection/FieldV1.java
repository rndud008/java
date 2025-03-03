package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Field;

public class FieldV1 {
    public static void main(String[] args) {
        Class<BasicData> helloClass = BasicData.class;

        System.out.println("==== fields() ====");
        Field[] fields = helloClass.getFields();

        for (Field field : fields){
            System.out.println("field = " + field);
            // 모든 public 필드를 반환
        }

        System.out.println("==== declareFields() ====");
        Field[] declaredFields = helloClass.getDeclaredFields();
        for (Field field: declaredFields){
            System.out.println("declaredField = " + field);
            // 모든 필드를 반환 하며 접근제어자에 관계없이 반환, 상속된 필드는 포함되지 않음.
        }
    }
}
