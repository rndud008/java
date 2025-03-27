package nested.nested;

import static nested.nested.NestedOuter.*;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        Nested nested = new Nested();
        nested.print();

        System.out.println("nested = " + nested);
        System.out.println("nested.getClass() = " + nested.getClass());
    }
}
