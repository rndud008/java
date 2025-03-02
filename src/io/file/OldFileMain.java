package io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class OldFileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");
        File directroy = new File("temp/exampleDir");

        System.out.println("file.exists = " + file.exists());

        boolean created = file.createNewFile();
        System.out.println("File created = " + created);

        boolean dirCreated = directroy.mkdir();
        System.out.println("Directory Created = " + dirCreated);

//        boolean deleted = file.delete();
//        System.out.println("deleted = " + deleted);

        System.out.println("Is File: " + file.isFile());
        System.out.println("Is Directory: " + directroy.isDirectory());
        System.out.println("File Name: " + file.getName());
        System.out.println("File Size: " + file.length() + " bytes");

        File newFile = new File("temp/newExample.txt");

        boolean renamed = file.renameTo(newFile);
        System.out.println("File renamed:" +  renamed);

        long lastModified =  newFile.lastModified();
        System.out.println("Last Modified = " + new Date(lastModified));
    }
}
