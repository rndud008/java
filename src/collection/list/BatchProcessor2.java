package collection.list;

public class BatchProcessor2 {
    private final MyList<Integer> list;

    //MyList = new MyArrayList
    //MyList = new MyLinkedList
    public BatchProcessor2(MyList<Integer> list) {
        this.list = list;
    }
    // BatchProcessor 를 생성하는 시점에 생성자를 토앻 원하는 리스트 전략을 선택해서 전달
    // MyList를 사용하는 클라이언트 코드인 BatchProcessor를 변경하지 않고 웒나느 리스트 전략을 런타임에 지정

    public void logic(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0,i); // 앞에 추가.
        }
        long endTime = System.currentTimeMillis();

        System.out.println("크기: " + size +", 계산 시간: " + (endTime - startTime) + "ms" );
    }

}
