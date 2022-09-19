package com.mytest;

public class Demo {
    public static void main(String[] args) {
        char[] ch = {'a','b','c'};
        String str = new String(ch);
        String str1 = new String(ch);
        System.out.println(str);
        System.out.println(str1);

        System.out.println(str == str1);//比较地址值
        System.out.println(str.equals(str1));//比较字符串内容

        System.out.println("-----------------");

        String s1 = "abc";
        String s2 = "a";
        System.out.println(s1 == s2);
    }
}
