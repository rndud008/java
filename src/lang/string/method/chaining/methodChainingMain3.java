package lang.string.method.chaining;

public class methodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        int result = adder.add(1).add(2).add(3).add(4).getValue();

        System.out.println("result = " + result);


    }
}
