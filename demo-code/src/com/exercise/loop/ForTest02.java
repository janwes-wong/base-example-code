package com.exercise.loop;

import java.util.Random;
import java.util.Scanner;

public class ForTest02 {
    public static void main(String[] args) {
        //从控制台读入数据
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        //猜一个1~100的随机整数
        int i = r.nextInt(100)+1;
        System.out.println("猜数游戏开始");
        while (true){
            System.out.println("请输入您要猜的数:");
            int num = sc.nextInt();
            if (num < i){
                System.out.println("您猜的数小了，请重新猜");
            }else if (num > i){
                System.out.println("您猜的数大了，请重新猜");
            }else{
                System.out.println("恭喜您猜中了！");
                System.out.println("猜数游戏结束!");
                break;
            }
        }
    }
}
