package io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static java.nio.file.StandardCopyOption.*;

public class FileCopyMainV3 {

    public static void main(String[] args) throws IOException {

        long startTime = System.currentTimeMillis();

        Path source = Path.of("temp/copy.dat");
        Path target = Path.of("temp/copy_new.dat");
        Files.copy(source, target, REPLACE_EXISTING);

        // Files.copy는 자바에 파일 데이터를 불러오지 않고, 운영체제의 파일 복사 기능을 사용한다.

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + "ms");
    }
}
