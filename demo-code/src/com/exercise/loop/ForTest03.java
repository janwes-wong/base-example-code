package com.exercise.loop;

import java.util.Random;
import java.util.Scanner;

public class ForTest03 {
    public static void main(String[] args) {
        //从控制台读入数据
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        //猜一个1~100的随机整数
        int i = r.nextInt(100)+1;
        System.out.println("猜数游戏开始");
        //增加猜数次数限制
        int count = 4;
        while (true){
            System.out.println("请输入您要猜的数:");
            int num = sc.nextInt();
            if (num < i){
                System.out.println("您猜的数小了，请重新猜");
                if (count != 0){
                    System.out.println("您还有"+count--+"次机会");
                }else{
                    System.out.println("Game Over!您没有机会了！");
                    //结束整个while循环
                    break;
                }
            }else if (num > i){
                System.out.println("您猜的数大了，请重新猜");
                if (count != 0){
                    System.out.println("您还有"+count--+"次机会");
                }else{
                    System.out.println("Game Over!您没有机会了！");
                    //结束整个while循环
                    break;
                }
            }else{
                System.out.println("恭喜您猜中了！");
                System.out.println("猜数游戏结束!");
                //结束整个while循环
                break;
            }
        }
    }
}
