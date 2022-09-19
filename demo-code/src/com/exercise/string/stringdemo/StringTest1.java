package com.exercise.string.stringdemo;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.next();
        System.out.println("该字符串长度是："+s.length());
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            System.out.print(str+" ");
        }
    }
}
