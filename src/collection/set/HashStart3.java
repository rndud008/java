package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        // 입력 : {1,2,5,8,14,99}
        // inputArray = [null, 1, 2, null, null, 5, null, null, 8, null], ... , 14,null,...,99}
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 데이터의 값을 인덱스로 사용한 덕분에 O(1)의 매우 빨느 검색속도를 얻을수 잇음
        // 낭비되는 메모리 공간이 너무 많음.

        int searchValue = 99;
        int result = inputArray[searchValue];// O(1)
        System.out.println("result = " + result);

    }

}

