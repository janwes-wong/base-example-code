package com.exercise.array.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个静态初始化数组
        int[] arr = {0, 2, 2, 4};
        //定义一个新的动态初始化数组
        int[] newArr = new int[4];
        //定义一个变量用来表示新数组的索引
        int index = 0;
        //循环遍历数组
        for (int x = 0; x < arr.length; x++) {
            //判断数组元素是否等于0
            if (arr[x] != 0) {
                //将arr数组的元素赋值给newArr新数组保存
                newArr[index] = arr[x];
                index++;
            }
        }
        //将newArr数组赋值给arr数组(赋值地址值)
        arr = newArr;
        //循环遍历打印数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
