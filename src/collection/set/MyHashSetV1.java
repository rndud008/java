package collection.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    LinkedList<Integer>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    //O(n)
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    private int hashIndex(int value){
        return value % capacity;
    }

    // O(n)
    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public int size() {
        return size;
    }

    public boolean remove(int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
       boolean result = bucket.remove(Integer.valueOf(value));
        // bucket.remove(value); index를 전달하면 index 위치의 값이 지워짐. -> 숫자 전달.
        // bucket.remove(Integer.valueOf(value)); 해당 오브젝트의 값을 지우게됨.
        if (result){
            size--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
