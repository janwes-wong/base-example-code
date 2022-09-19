package com.exercise.file.filedemo;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("D:\\JavaEE基础班听课资料\\new");
        File file1 = new File("D:\\JavaEE基础班听课资料\\old\\abc");

        //创建单级文件夹
        file.mkdir();

        //创建多级文件夹
        file1.mkdirs();
    }
}
