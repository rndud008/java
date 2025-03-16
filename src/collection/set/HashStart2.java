package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        // inputArray = [null, 1, 2, 3, null, null, null, null, 8, null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[3] = 3;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 데이터의 값 자젳를 배열의 인덱스로 적용
        // 배열에서 인덱스로 데이터를 찾는 것은 매우 빠름
        // O(n)의 검색성능을 O(1)로 개선.

        //문제점.
        // 입력 값의 범위 만큼 큰배열 을 사용해야함
        // 배열에 낭비되는 공간이 많이 발생.

        int searchValue = 8;
        int result = inputArray[searchValue];// O(1)
        System.out.println("result = " + result);

    }

}

