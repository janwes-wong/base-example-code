package com.exercise.array.array;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {5,44,33,22,55,66,11,72};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("数组中最大的值max是："+max);
    }
}