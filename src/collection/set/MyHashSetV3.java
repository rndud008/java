package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
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
    public boolean add(E value) {
        int hashIndex = hashIndex(value);

        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;
        return true;
    }

    private int hashIndex(E value){

//        int hashCode = value.hashCode();
        // 음수가 나올수도 잇음.
//        int hasIndex = Math.abs(hashCode) % capacity;
//        return hasIndex;

         return Math.abs(value.hashCode()) % capacity;
    }

    // O(n)
    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public int size() {
        return size;
    }

    public boolean remove(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
       boolean result = bucket.remove(value);

        if (result){
            size--;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
