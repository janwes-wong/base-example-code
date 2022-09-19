package com.exercise.file.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JavaEE基础班听课资料\\aaa.txt");

        /*
            public boolean createNewFile()
            当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
         */
        boolean result = file.createNewFile();

        System.out.println(result);
    }
}
