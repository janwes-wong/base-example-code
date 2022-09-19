package com.mytest;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        //定义变量，用于统计三个字符类型的个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //遍历字符串，并判断三种类型字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }

        //输出三种字符类型的个数
        System.out.println("大写字符类型的个数是：" + bigCount + "个");
        System.out.println("小写字符类型的个数是：" + smallCount + "个");
        System.out.println("数字字符类型的个数是：" + numberCount + "个");
    }
}
