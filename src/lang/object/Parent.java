package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent {
    // extends Object 를 하지 않아도 묵시적으로 되어 있음.
    public void parentMethod(){
        System.out.println("Parent.parentMethod");

    }
}
