package com.janwes.sort;

import java.util.Arrays;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.sort
 * @date 2022/2/7 17:25
 * @description 希尔排序 时间复杂度O(n㏒n) 空间复杂度O(1) n小时较好
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {32, 8, 3, 21, 15, 76, 41, 57, 63, 38};
        System.out.println("升序排序：" + Arrays.toString(ascSort(nums)));
        System.out.println("排序：" + Arrays.toString(sort(nums)));
    }

    private static int[] ascSort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        for (; h >= 1; h /= 3) {
            for (int i = 0; i < arr.length - h; i += h) {
                for (int j = i + h; j > 0; j -= h) {
                    if (arr[j] < arr[j - h]) {
                        int temp = arr[j];
                        arr[j] = arr[j - h];
                        arr[j - h] = temp;
                    }
                }
            }
        }
        return arr;
    }

    /**
     * 希尔排序(插入排序变种版)
     *
     * @param arr
     * @return
     */
    private static int[] sort(int[] arr) {
        // i层循环控制步长
        for (int i = arr.length; i > 0; i /= 2) {
            for (int j = i; j < arr.length; j++) {
                // j循环控制无序端的起始位置
                for (int k = j; k > 0 && k - i >= 0; k -= i) {
                    if (arr[k] < arr[k - i]) {
                        int temp = arr[k - i];
                        arr[k - i] = arr[k];
                        arr[k] = temp;
                    } else {
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
