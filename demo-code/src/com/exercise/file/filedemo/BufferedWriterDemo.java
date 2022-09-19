package com.exercise.file.filedemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流
        BufferedWriter bw  = new BufferedWriter(new FileWriter("C:\\Users\\HZWJa\\Desktop\\abc.txt"));

        bw.write("zhangsan,123456");
        //换行
        bw.newLine();
        bw.write("lisi,123aaabbb");
        //换行
        bw.newLine();
        bw.write("wangwu,369qazwsx");
        //换行
        bw.newLine();

        bw.close();
    }
}