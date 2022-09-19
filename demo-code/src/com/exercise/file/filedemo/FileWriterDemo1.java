package com.exercise.file.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {

        //也可以此方式书写
        //File file = new File("D:\\JavaEE基础班听课资料\\aaa.txt");
        //FileWriter fw1 = new FileWriter(file);

        //创建一个字符输出流，准备往参数表示的文件中写入数据
        FileWriter fw = new FileWriter(new File("D:\\JavaEE基础班听课资料\\aaa.txt"));

        //调用write()方法向硬盘中写入数据
        fw.write("123abc哈哈哈哈哈嘻嘻嘻嘻嘻嘻");

        //释放资源 关闭通道
        fw.close();
    }
}
