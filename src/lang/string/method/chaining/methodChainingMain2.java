package lang.string.method.chaining;

public class methodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);
        ValueAdder adder4 = adder3.add(4);

        int result = adder4.getValue();

        System.out.println("result = " + result);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
        System.out.println("result = " + adder4);

    }
}
