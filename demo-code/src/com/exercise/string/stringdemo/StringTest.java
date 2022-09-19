package com.exercise.string.stringdemo;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String usernameRight = "zhangsan";
        String passwordRight = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的用户名：");
        String username = sc.next();
        System.out.println("请输入您的密码：");
        String password = sc.next();
        if (username.equals(usernameRight) && password.equals(passwordRight)) {
            System.out.println("您输入端的用户名和密码正确");
        } else {
            System.out.println("您输入的的用户名和密码错误");
        }
    }
}
