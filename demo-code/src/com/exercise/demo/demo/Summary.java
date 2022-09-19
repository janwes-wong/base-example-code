package com.exercise.demo.demo;

public class Summary {
    public static void main(String[] args) {

        int sum = getSum(10,15);

        System.out.println("赋值调用："+sum);
    }

    public static int getSum(int a,int b){
        return a + b;
    }
}
