package com.exercise.string.stringdemo;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //创建一个User类型的数组
        User[] arr = new User[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        System.out.println("请再次输入密码：");
        String rePassword = sc.next();
        //定义一个变量，用于表示数组的索引
        int index = 0;
        //判断用户名和密码是否一致
        if (password.equals(rePassword)) {
            //创建User对象
            User user = new User(username, password);
            //将user对象赋值给arr数组
            arr[index] = user;
            index++;
        } else {
            System.out.println("两次输入的密码不一致！");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getUsername() + "---" + arr[i].getPassword());
            }
        }
    }
}
