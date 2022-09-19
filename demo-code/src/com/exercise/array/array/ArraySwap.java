package com.exercise.array.array;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        //1.定义两个变量，start和end来表示开始和结束
        //2.确定两个交换条件
        //3.
        for (int start = 0,end = arr.length-1; start < end ;start++,end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
