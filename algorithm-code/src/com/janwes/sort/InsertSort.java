package com.janwes.sort;

import java.util.Arrays;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.sort
 * @date 2022/2/7 15:38
 * @description 插入排序 时间复杂度O(n²) 空间复杂度O(1)
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {32, 8, 3, 21, 15, 76, 41, 57, 63, 38};
        System.out.println("升序排序：" + Arrays.toString(ascSort(nums)));
        System.out.println("降序排序：" + Arrays.toString(descSort(nums)));
    }

    private static int[] ascSort(int[] nums) {
        // 外层循环 从第二个元素开始比较
        for (int i = 1; i < nums.length; i++) {
            // 内层循环 与前面已排好序的元素进行比较
            for (int j = i; j > 0; j--) {
                // 如果后面元素值小于前面元素值 则进行交换
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                } else {
                    // 如果不小于，说明插入完成 退出内层循环
                    break;
                }
            }
        }
        return nums;
    }

    private static int[] descSort(int[] arr) {
        // 外层循环 从第二个元素开始比较
        for (int i = 1; i < arr.length; i++) {
            // 内层循环 与前面已排好序的元素进行比较
            for (int j = i; j > 0; j--) {
                // 如果后面元素值小于前面元素值 则进行交换
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // 如果不小于，说明插入完成 退出内层循环
                    break;
                }
            }
        }
        return arr;
    }
}
