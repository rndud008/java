package io.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class NewFilesPath {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("temp/..");
        System.out.println("path = " + path);

        // 절대경로
        System.out.println("file.getAbsolutePath() = " + path.toAbsolutePath());

        // 정규 경로
        System.out.println("file.getCanonicalPath() = " + path.toRealPath());

        // 스트림이라는 개게체 람다와 스트림.
        Stream<Path> pathStream = Files.list(path);
        List<Path> list = pathStream.toList();
        pathStream.close();

        for (Path p : list){
            System.out.println( (Files.isRegularFile(p) ? "F" : "D") + " | " + p.getFileName());
        }

    }

}
