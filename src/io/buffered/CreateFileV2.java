package io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class CreateFileV2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        // 데이터를 먼저 buffer 라는 byte[] 에 담아둔다.
        // BUFFER_SIZE 버퍼에 많은 크기를 보낸다 해도 시스템 운영체제에서는 4KB OR 8KB 를 사용하기때문에 더이상 전송 속도가 빨라지지 않는다.

        int bufferIndex = 0;

        for (int i = 0; i < FILE_SIZE; i++){
            buffer[bufferIndex++] =1;

            if (bufferIndex == BUFFER_SIZE){
                fos.write(buffer);
                // BUFFER_SIZE 의 사이즈 만큼 데이터를 모아서 WRITE를 호출한다.
                bufferIndex = 0;
            }

        }

        //  끝부분에 오면 버퍼가 가득차지 않고, 남아 있을수 있다. 버퍼에 남은 부분 쓰기
        if (bufferIndex > 0){
            fos.write(buffer,0, bufferIndex);
        }

        fos.close();
        long endTime = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " +(FILE_SIZE / 1024 / 1024 )+ "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }

}
