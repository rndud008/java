package collection.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV4(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV4(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }
    public void  add(E e){
        if (size == elementData.length){
            grow();
        }

        elementData[size] = e;
        size++;
    }

    // 코드 추카
    public void add(int index,E e){
        if (size == elementData.length){
            grow();
        }
        // 데이터 이동.
        shiftRightFrom(index);

        elementData[index] = e;
        size++;

    }

    // 코드추가 , 요소의 마지막부터 index 까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index ; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity *2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사.
//        Object[] newArr = new Object[newCapacity];
//
//        for (int i = 0; i < elementData.length; i++) {
//            newArr[i] = elementData[i];
//        }

        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        // 원래 배열을 복사하면서 길이가 newCapacity 만큼인 배열을 새로 만듬.

        elementData = newArr;
    }

    @SuppressWarnings("unchecked") // 자바의 경고를 체크하지 않음.
    public E get(int index){
        return (E) elementData[index];
    }

    public E set(int index, E element){
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    // 코드 추가
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
