package com.mytest;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String username = "zhangsan";
        String password = "abc123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的的用户名：");
            String name = sc.nextLine();
            System.out.println("请输入您的密码：");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登录成功!");
                return;
            } else {
                if (i == 0) {
                    System.out.println("登录失败，您还有" + (2 - i) + "次登录机会");
                } else if (i == 1) {
                    System.out.println("登录失败，您还有" + i + "次登录机会");
                } else {
                    System.out.println("您的账号已被锁定，请联系管理员");
                }
            }
        }
    }
}
