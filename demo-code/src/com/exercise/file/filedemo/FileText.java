package com.exercise.file.filedemo;

import java.io.File;
import java.io.IOException;

public class FileText {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\HZWJa\\Desktop\\new");
        File file2 = new File("C:\\Users\\HZWJa\\Desktop\\new\\abc.txt");

        //创建文件夹目录
        if (file1.mkdirs()) {
            System.out.println("文件夹创建成功!");
        } else {
            System.out.println("文件夹创建失败!");
        }

        //创建文件
        if (file2.createNewFile()) {
            System.out.println("文件创建成功!");
        } else {
            System.out.println("文件创建失败!");
        }

        //删除文件
        /*if (file2.delete()) {
            System.out.println("文件删除成功!");
        } else {
            System.out.println("文件删除失败!");
        }

        //删除文件夹目录
        if (file1.delete()) {
            System.out.println("文件夹删除成功!");
        } else {
            System.out.println("文件夹删除失败!");
        }*/
    }
}
