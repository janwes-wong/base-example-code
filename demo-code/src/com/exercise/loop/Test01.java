package com.exercise.loop;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*char c = '\u2605';//打印五角星
        for (int i = 0; i<10 ;i++){
            for (int j = 0; j<9 ; j++){
                System.out.print(c);
                System.out.print("");
            }
            System.out.println(c);
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的考试成绩:");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100){
            if (score >= 95){
                System.out.println("您的考试成绩为A+");
            }else if(score >= 9 && score <= 94){
                System.out.println("您的考试成绩为A");
            }else if(score >= 80 && score <= 89){
                System.out.println("您的考试成绩为B+");
            }else if(score >= 70 && score <= 79){
                System.out.println("您的考试成绩为B");
            }else if(score >= 60 && score <= 69){
                System.out.println("您的考试成绩为C");
            }else{
                System.out.println("您的考试成绩不合格，请继续努力！");
            }
        }else{
            System.out.println("您输入的成绩有误!");
        }

    }
}