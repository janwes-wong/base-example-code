package com.mytest;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        //遍历字符串内的字符
        for (int i = 0; i < s.length(); i++) {
            //charAt(i)返回指定索引处的char值
            System.out.println(s.charAt(i));
        }
    }
}
