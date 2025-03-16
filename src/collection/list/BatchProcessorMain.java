package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        BatchProcessor2 p = new BatchProcessor2(list);
        p.logic(100_000);

        p= new BatchProcessor2(new MyLinkedList<>());
        p.logic(100_000);
    }

}
