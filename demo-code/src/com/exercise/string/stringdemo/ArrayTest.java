package com.exercise.string.stringdemo;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        //调用printArr方法
        printArr(arr);
    }
    public static void printArr(int[] arr){
        //遍历数组打印arr指向的数值中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}