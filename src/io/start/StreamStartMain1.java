package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp/hello.dat"); // 기본은 false
//        FileOutputStream fos = new FileOutputStream("temp/hello.dat",true); //  true 로 설정하면 기본 파일에 문자를 이어서 작성.
        fos.write(65);
        fos.write(66);
        fos.write(67);
        fos.close();
        // temp 라는 폴더에 hello.dat 파일을 숫자 65, 66, 67을 ASCII 코드로 변환하여 A, B, C로 저장.
        // 파일 이 없으면 새로 생성하고 있으면 그파일에 덮어 씌움.
        // output/ input Stream 을 사용하면 자원을 반납하기 위해 close 를 사용

        FileInputStream fis =  new FileInputStream("temp/hello.dat");
        System.out.println(fis.read()); // 65 A
        System.out.println(fis.read()); // 66 B
        System.out.println(fis.read()); // 67 C
        System.out.println(fis.read()); // -1 파일의 끝에 도달 하여 더이상 읽을게 없음

        fis.close();
    }
}
