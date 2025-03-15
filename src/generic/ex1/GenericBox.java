package generic.ex1;

public class GenericBox <T>{
    //<T> 타입 매개변수.

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
