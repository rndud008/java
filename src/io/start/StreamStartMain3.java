package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {

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
        byte[] buffer = new byte[10];
        int readCount = fis.read(buffer,0,10);
        // fis.read(byte[] ,offset ,length);
        // byte[] 데이터가 읽혀지는 버퍼
        // offset -> off 데이터 기록되는 byte[] 시작위치
        // length -> 읽어올 byte의 최대길이

        // fis.read(byte[] );
        // offset 은 0
        // length 는 byte[].length 를 사용함
        System.out.println("readCount = " + readCount);
        System.out.println(Arrays.toString(buffer));
        fis.close();

    }
}
