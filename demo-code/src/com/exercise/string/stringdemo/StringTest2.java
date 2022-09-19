package com.exercise.string.stringdemo;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");//itheima---123456
        String s = sc.nextLine();
        String[] str = s.split("---");

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
