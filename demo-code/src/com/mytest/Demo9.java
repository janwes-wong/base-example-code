package com.mytest;

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        String str = reverseString(s);

        System.out.println(str);
    }

    public static String reverseString(String str) {
        /*  此种写法可以实现，代码不会报错
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            String ss = sb.toString();
            return ss;
        */
        return new StringBuilder(str).reverse().toString();
    }
}
