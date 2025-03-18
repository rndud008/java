package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currnetIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {

        this.targetArr = targetArr;
    }

    @Override
    public boolean hasNext() {
        return currnetIndex < targetArr.length -1;
    }

    @Override
    public Integer next() {
//        currnetIndex++;
//        int result = targetArr[currnetIndex];
//        return result;

        return targetArr[++currnetIndex];
    }
}
