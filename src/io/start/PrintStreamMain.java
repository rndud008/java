package io.start;

import java.io.IOException;
import java.io.PrintStream;

import static java.nio.charset.StandardCharsets.*;

public class PrintStreamMain {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");

        PrintStream printStream = System.out;

        byte[] bytes = "Helllo!\n".getBytes(UTF_8);
        printStream.write(bytes);
        printStream.println("Print!");
    }
}
