package generic.test.ex2;

public class Pair<T1, T2> {
    private T1 item1;
    private T2 item2;

    public T1 getFirst(){
        return item1;
    }
    public T2 getSecond(){
        return item2;
    }

    public void setFirst(T1 item1) {
        this.item1 = item1;
    }

    public void setSecond(T2 item2) {
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }
}
