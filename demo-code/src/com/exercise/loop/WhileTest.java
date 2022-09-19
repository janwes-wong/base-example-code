package com.exercise.loop;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个1~100的整数：");
            int num = sc.nextInt();
            if (num >= 0 && num <= 100){
                System.out.println("您输入的整数是："+num);
                break;
            }else{
                System.out.println("您的输入有误，请重新输入：");
            }
        }
    }
}
