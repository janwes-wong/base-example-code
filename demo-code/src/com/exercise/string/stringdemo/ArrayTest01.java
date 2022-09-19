package com.exercise.string.stringdemo;

public class ArrayTest01 {
    public static void main(String[] args) {
        //赋值调用returnArr()方法
        int[] newArr = returnArr();
        //遍历newArr数组
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static int[] returnArr(){
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 15;
        return arr;
    }
}
