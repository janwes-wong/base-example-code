package com.exercise.file.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterUserInfo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入用户名：");
        String password = sc.next();

        //将键盘输入的数据写入本地指定路径文件
        FileWriter fw = new FileWriter(new File("C:\\Users\\HZWJa\\Desktop\\userinfo.txt"));

        //将用户名写入
        fw.write(username);
        //换行
        fw.write("\r\n");
        //将用户密码写入
        fw.write(password);

        //释放资源
        fw.close();
    }
}
