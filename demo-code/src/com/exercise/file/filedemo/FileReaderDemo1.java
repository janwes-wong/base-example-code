package com.exercise.file.filedemo;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\HZWJa\\Desktop\\abc.txt");

        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

        fr.close();
    }
}
