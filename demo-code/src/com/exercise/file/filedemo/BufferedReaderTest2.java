package com.exercise.file.filedemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferedReaderTest2 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HZWJa\\Desktop\\userInfo.txt"));
        //创建集合User用户对象
        ArrayList<User> list = new ArrayList<>();
        //读取数据并添加到集合中
        String line;
        while ((line = br.readLine()) != null) {
            String[] userInfoArr = line.split(",");
            //创建用户对象并存入集合
            User user = new User(userInfoArr[0], userInfoArr[1]);
            list.add(user);
        }

        br.close();

        //键盘输入用户信息并比较
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        //创建User用户对象传入输入信息并对比
        User user = new User(username, password);

        boolean result = list.contains(user);
        System.out.println(result);
        //判断并打印输出相关信息
        if (list.contains(user)) {
            System.out.println("用户名和密码正确");
        } else {
            System.out.println("用户名和密码错误");
        }
    }
}
