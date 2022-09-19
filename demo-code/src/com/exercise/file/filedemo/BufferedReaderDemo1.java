package com.exercise.file.filedemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HZWJa\\Desktop\\userInfo2.txt"));
        //读取数据
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
