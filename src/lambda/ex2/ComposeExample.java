package lambda.ex2;

public class ComposeExample {
    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();

        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper,addDeco);

        String s = composeFunc.transForm("java");
        System.out.println("s = " + s);
    }

    private static MyTransformer compose(MyTransformer toUpper, MyTransformer addDeco) {

        return s -> addDeco.transForm(toUpper.transForm(s));
    }
}
