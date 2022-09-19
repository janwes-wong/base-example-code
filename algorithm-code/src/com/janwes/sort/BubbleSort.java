package com.janwes.sort;

import java.util.Arrays;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.sort
 * @date 2022/2/7 10:12
 * @description 冒泡排序 时间复杂度O(n²) 空间复杂度O(1) n小时较好
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {32, 8, 3, 21, 15, 76, 41, 57, 63, 38};
        System.out.println("降序排序：" + Arrays.toString(descSort(nums)));
        System.out.println("升序排序：" + Arrays.toString(ascSort(nums)));
    }

    private static int[] descSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] ascSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
