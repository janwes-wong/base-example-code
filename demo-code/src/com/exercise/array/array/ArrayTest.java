package com.exercise.array.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        //定义一个变量sum，用来存储数组内的数值和
        int sum = 0;
        //定义一个变量sumOu，用来存储数组内的为偶数数值的和
        int sumOu = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                //将数组遍历出的数值赋值给sumOu变量
                sumOu += arr[i];
            }
            //将数组遍历出的数值赋值给sum变量
            sum += arr[i];
        }
        //打印输出
        System.out.println("数组内的数据和是："+sum);
        System.out.println("数组内的数据偶数和是："+sumOu);
    }
}
