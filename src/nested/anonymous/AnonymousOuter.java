package nested.anonymous;

import nested.local.LocalOuterV2;
import nested.local.Printer;

public class AnonymousOuter {

    private int outInnstanceVar = 3;
    public void process(int paramVar){
        int localVar=1;

        Printer printer = new Printer(){
            int value =0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInnstanceVar = " + outInnstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.getClass() = " + printer.getClass());

    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV2 = new LocalOuterV2();
        localOuterV2.process(2);
    }
}
