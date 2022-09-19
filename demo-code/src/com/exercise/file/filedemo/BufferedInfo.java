package com.exercise.file.filedemo;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BufferedInfo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HZWJa\\Desktop\\userInfo.txt"));

        ArrayList<User> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] userInfoArr = line.split(",");
            User user = new User(userInfoArr[0], userInfoArr[1]);
            list.add(user);
        }
        //释放资源
        br.close();

        //键盘输入用户信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();

        User user = new User(username, password);

        //判断用户名信息和键盘输入的用户信息比较
        if (list.contains(user)) {
            System.out.println("用户名和密码已存在");
        } else {
            System.out.println("用户名和密码不存在");

            //如果用户信息不存在，添加到集合对象中
            list.add(user);
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\HZWJa\\Desktop\\userInfo.txt"));
            for (int i = 0; i < list.size(); i++) {
                User userInfo = list.get(i);
                bw.write(userInfo.getUsername());
                bw.write(",");
                bw.write(userInfo.getPassword());
                bw.newLine();
            }

            bw.close();
        }

    }
}
