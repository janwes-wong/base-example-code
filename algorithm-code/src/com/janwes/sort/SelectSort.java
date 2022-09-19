package com.janwes.sort;

import java.util.Arrays;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.sort
 * @date 2022/2/7 14:56
 * @description 选择排序 时间复杂度O(n²) 空间复杂度O(1) n小时较好
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {32, 8, 3, 21, 15, 76, 41, 57, 63, 38};
        System.out.println("升序排序：" + Arrays.toString(ascSort(nums)));
        System.out.println("降序排序：" + Arrays.toString(descSort(nums)));
    }

    private static int[] ascSort(int[] arr) {
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            // 默认第一个索引元素值为最小值
            int min = arr[i];
            // 记录索引
            int index = i;
            // 与后面数据进行比较 得出最小值和索引
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            // 然后将最小值与本次循环的，开始值交换
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            // 说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无需的最小值，做替换
        }
        return arr;
    }

    private static int[] descSort(int[] nums) {
        // 遍历
        for (int i = 0; i < nums.length; i++) {
            // 默认第一个索引元素值为最大值
            int max = nums[i];
            // 记录索引
            int index = i;
            // 与后面数据进行比较 得出最大值和索引
            for (int j = i + 1; j < nums.length; j++) {
                if (max < nums[j]) {
                    max = nums[j];
                    index = j;
                }
            }
            // 然后将最大值与本次循环的，开始值交换
            int temp = nums[i];
            nums[i] = max;
            nums[index] = temp;
            // 说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无需的最小值，做替换
        }
        return nums;
    }
}
