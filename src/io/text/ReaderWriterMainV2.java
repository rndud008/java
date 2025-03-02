package io.text;

import java.io.*;
import java.util.Arrays;

import static io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

public class ReaderWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString = " + writeString);

        //파일에 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);
        // byte 변환은 outputStreamWriter 에서 진행.
        // 모든 데이터는 byte 단위로 (숫자)로 저장이 되고 디코딩하여 문자로 변환하는 작업이 필요.

        osw.write(writeString);
        osw.close();
        
        //파일에서 읽기
        FileInputStream fis = new FileInputStream(FILE_NAME);
        InputStreamReader isr = new InputStreamReader(fis, UTF_8);

        StringBuilder content = new StringBuilder();

        int ch;
        while ((ch = isr.read()) != -1){
            // 데이터를 읽을때는 int ch =read() 를 제공하는데
            // 여기서는 문자 하나인 char 형으로 데이터를 받게 된다.
            // 실제 반환타입은 int 형이므로 char 형으로 캐스팅해서 사용하면 된다.
            // char 형은 파일의 끝인 -1 을 표현할수 없으므로 대신 int 를 반환.
            content.append((char) ch);
        }

        isr.close();
        System.out.println("content = " + content);
    }
}
