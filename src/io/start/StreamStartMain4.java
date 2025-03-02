package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain4 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat"); // 기본은 false
//        FileOutputStream fos = new FileOutputStream("temp/hello.dat",true); //  true 로 설정하면 기본 파일에 문자를 이어서 작성.
        byte[] input = {65, 66, 67, 68};
        fos.write(input);
        fos.close();
        // temp 라는 폴더에 hello.dat 파일을 숫자 65, 66, 67을 ASCII 코드로 변환하여 A, B, C로 저장.
        // 파일 이 없으면 새로 생성하고 있으면 그파일에 덮어 씌움.
        // output/ input Stream 을 사용하면 자원을 반납하기 위해 close 를 사용

        FileInputStream fis =  new FileInputStream("temp/hello.dat");

        byte[] readAllBytes = fis.readAllBytes();
        //  전체 파일 읽기
        // 작은 파일을 읽을때 적합 그리고 메모리 사용량을 제어 할수 없음.
        // 큰파일의 경우 outofmemoryError 발생
        System.out.println("readAllBytes = " + Arrays.toString(readAllBytes));

        fis.close();

    }
}
