package io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static io.buffered.BufferedConst.*;

public class CreateFileV3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
        // 버퍼기능을 제공.
        // 동기화 기능때문에 CreateFileV2 와 다소 차이가 있다.
        long startTime = System.currentTimeMillis();

        for (int i = 0; i< FILE_SIZE; i++){
            bos.write(1);
        }
        bos.close();

        long endTime = System.currentTimeMillis();

        System.out.println("File created: " + FILE_NAME);
        System.out.println("File size: " +(FILE_SIZE / 1024 / 1024 )+ "MB");
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }

}
