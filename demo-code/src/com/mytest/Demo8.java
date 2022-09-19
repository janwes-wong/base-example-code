package com.mytest;

public class Demo8 {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder("abcdefg");

        //调用reverse()方法反转字符串内容
        sb.reverse();

        //打印输出字符串
        System.out.println(sb);
    }
}
