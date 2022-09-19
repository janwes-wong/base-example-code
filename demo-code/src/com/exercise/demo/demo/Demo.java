package com.exercise.demo.demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//从控制台读取数据
        //System.out.println("请输入密码：");
        //String str = ascanner.nextLine();
        String s = "123456ABC";
        boolean i = true;
        while (i){
            System.out.println("请输入密码：");
            String str = scanner.nextLine();
            if (str.equals(s)){
                System.out.println("你输入的密码正确");
                i = false;
            }else {
                System.out.println("你输入的密码有误，请重新输入");
            }
        }
    }

}
