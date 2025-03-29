package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInnstanceVar = 3;
    public Printer process(int paramVar){
        int localVar=1;

        class  LocalPrinter implements Printer{
            int value =0; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.
            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInnstanceVar = " + outInnstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // 만약 lovalVar의 값을 변경한다면? 다시 캡쳐해야 하나??
        // localVar = 10; // 컴파일 오류
        // paramVar =20; // 컴파일 오류
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV4 = new LocalOuterV4();
        Printer printer = localOuterV4.process(2);
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields){
            System.out.println("field = " + field);
        }

//        field = int nested.local.LocalOuterV3$1LocalPrinter.value
//        field = final int nested.local.LocalOuterV3$1LocalPrinter.val$localVar
//        field = final int nested.local.LocalOuterV3$1LocalPrinter.val$paramVar
//        field = final nested.local.LocalOuterV3 nested.local.LocalOuterV3$1LocalPrinter.this$0

        // 지역클래스는 인스턴스를 생성할때 필요한 지역변수를 먼저 캡처해서 인스턴스에 보관한다.
        // 그리고 지역 클래스의 인스턴스를 통해 지역 변수에 접근하면, 실제로 지역 변수에 접근하는 것이 아니라 인스턴스에 있는 컵처한 캡처변수에 접근
    }
}
