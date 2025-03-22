package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);
        // 객체를 받지 않았기때문에          obj1.add(20); 아무것도 처리 되지 않은것처럼 보임.
        System.out.println("obj1 = " + obj1.getValue());

    }
}
