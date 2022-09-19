package com.exercise.loop;

import java.util.Scanner;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random a = new Random();
        int r = a.nextInt(100);
        boolean loop = true;
        while (loop) {
            System.out.println("请输入你的答案:");
            int max = s.nextInt();
            if (max > r){
                System.out.println("你猜大了");
            }else if(max < r){
                System.out.println("你猜小了");
            }else{
                System.out.println("恭喜你猜对了");
                loop = false;
            }
        }
    }
}
