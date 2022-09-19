package com.test;

public class ArrayTest {
    public static void main(String[] args) {
        //定义一个静态初始化数组
        int[] arr = {2, 6, 9, 12, 8};
        //定义一个计算数组中偶数的个数
        int count = 0;
        System.out.print("数组中的索引和元素都为偶数的元素是：");
        for (int i = 0; i < arr.length; i++) {
            //判断数组中为偶数的元素
            if (i % 2 == 0 && arr[i] % 2 == 0) {
                //打印输出数组中偶数的元素
                System.out.print(+arr[i] + " ");
                //累计偶数元素个数
                count++;
            }
        }
        System.out.println();
        System.out.println("偶数的个数为:" + count + "个");
    }
}
