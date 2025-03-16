package collection.list;

public class BatchProcessor {
    private final MyLinkedList<Integer> list = new MyLinkedList<>(); // 코드 변경

    public void logic(int size){
        for (int i = 0; i < size; i++) {
            list.add(0,i); // 앞에 추가.
        }
    }

}
