package io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV3 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString = " + writeString);

        //파일에 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
//        FileWriter fw = new FileWriter(FILE_NAME); 생략해서 사용하게되면 시스템의 기본값을 사용하게됨.
        // FileWriter  내부에서는 이코딩 셋을 사용해서 문자를 byte로 변경해 FileOutputStream 을 사용해 파일을 저장

        fw.write(writeString);
        fw.close();
        
        //파일에서 읽기
        FileReader fr = new FileReader(FILE_NAME,UTF_8);
//        FileReader fr = new FileReader(FILE_NAME); 생략해서 사용하게되면 시스템의 기본값을 사용하게됨.
        // 데이터를 읽을때도 내부에서는 FileInputStream 을 사용하여 데이트를 byte 단위로 읽어들임 . 그리고 문자집합을 사용해서 byte[]을 char로 디코딩
        StringBuilder content = new StringBuilder();

        int ch;
        while ((ch = fr.read()) != -1){
            content.append((char) ch);
        }

        fr.close();
        System.out.println("content = " + content);
    }
}
