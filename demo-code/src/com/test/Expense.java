package com.test;

import java.util.Scanner;

public class Expense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        //定义一个变量表示消费金额
        int p = sc.nextInt();
        //判断消费金额对应折扣
        if (p >= 0) {
            if (p >= 2000) {
                //消费折扣7折
                double discount = 0.7D;
                System.out.println("折扣7折，折扣前金额：" + p + "，打折后金额：" + (p * discount));
            } else if (p < 2000 && p >= 1000) {
                //消费折扣8折
                double discount = 0.8D;
                System.out.println("折扣8折，折扣前金额：" + p + "，打折后金额：" + (p * discount));
            } else if (p < 1000 && p >= 500) {
                //消费折扣9.5折
                double discount = 0.95D;
                System.out.println("折扣9.5折，折扣前金额：" + p + "，打折后金额：" + (p * discount));
            } else if (p < 500 && p >= 0) {
                System.out.println("不打折，金额：" + p);
            }
        } else {
            System.out.println("您输入的金额有误！");
        }
    }
}
