package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size(){
        return size;
    }
    @Override
    public void  add(E e){
        if (size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }


    @Override
    public void add(int index,E e){
        if (size == elementData.length){
            grow();
        }
        // 데이터 이동.
        shiftRightFrom(index);

        elementData[index] = e;
        size++;

    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index ; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity *2;

        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        // 원래 배열을 복사하면서 길이가 newCapacity 만큼인 배열을 새로 만듬.

        elementData = newArr;
    }

    @Override
    public E get(int index){
        return (E) elementData[index];
    }
    @Override
    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    @Override
    public E remove(int index){
        E oldValue = get(index);
        // 데이터 이동.
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i <  size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    @Override
    public int indexOf(Object o){
        for (int i =0; i<size; i++){
            if (o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        //[1,2,3,null,null] // size=3
        //[1,2,3] // size=3
        // Arrays.copyOf 배열의 길이만큼 잘라줌.
        return Arrays.toString(Arrays.copyOf(elementData,size)) + " size= " + size + ", capacity = " + elementData.length;
    }

}
