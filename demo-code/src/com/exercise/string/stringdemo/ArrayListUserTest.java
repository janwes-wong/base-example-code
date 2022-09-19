package com.exercise.string.stringdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUserTest {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            User user = new User(username, password);
            list.add(user);
        }

        //比较用户名和密码是否存在
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        User user = new User(username, password);

        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            //判断用户名和密码是否一致
            if (user.getUsername().equals(u.getUsername())
                    && user.getPassword().equals(u.getPassword())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("用户名和密码已存在!");
        } else {
            System.out.println("用户名和密码不存在!");
        }
    }
}
