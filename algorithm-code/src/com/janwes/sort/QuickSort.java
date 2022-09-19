package com.janwes.sort;

import java.util.Arrays;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.sort
 * @date 2022/2/9 16:02
 * @description 快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {32, 8, 3, 21, 15, 76, 41, 57, 63, 38};
        System.out.println(Arrays.toString(sort(nums, 0, nums.length - 1)));
        int[] arr = {32, 8, 3, 21, 15, 76, 41, 57, 63, 38};
        System.out.println(Arrays.toString(arrSort(arr, 0, nums.length - 1)));
    }

    private static int[] sort(int[] arr, int low, int high) {
        // 如果指针在同一位置(只有一个数据时)，退出
        if (high - low < 1) {
            return arr;
        }
        // 标记，从高指针开始，还是低指针（默认高指针）
        boolean flag = true;
        // 记录指针的真实位置
        int start = low;
        int end = high;
        // 默认中间值为低指针的第一个值
        int middle = arr[low];
        while (true) {
            // 高指针移动
            if (flag) {
                // 如果数组右方的元素大于中间值，则向左移动
                if (arr[high] > middle) {
                    high--;
                } else if (arr[high] < middle) {
                    // 如果小于，则覆盖最开始的低指针值，低指针向右移动，flag改成从低指针开始移动
                    arr[low] = arr[high];
                    low++;
                    flag = false;
                }
            } else {
                // 如果低指针数据小于中间值，则低指针向右移动
                if (arr[low] < middle) {
                    low++;
                } else if (arr[low] > middle) {
                    // 如果低指针的值大于中间值，则覆盖高指针停留时的数据，并向左移动高指针。切换为高指针移动
                    arr[high] = arr[low];
                    high--;
                    flag = true;
                }
            }
            // 当两个指针的位置相同时，则找到了中间值的位置，并退出循环
            if (low == high) {
                arr[low] = middle;
                break;
            }
        }
        // 然后出现有，中间值左边的小于中间值。右边的大于中间值。
        // 然后在对左右两边的列表在进行快速排序
        sort(arr, start, low - 1);
        sort(arr, low + 1, end);
        return arr;
    }

    private static int[] arrSort(int[] arr, int low, int high) {
        // 指针同一位置 直接返回
        if (low >= high) {
            return arr;
        }
        // 记录指针的真实位置
        int left = low;
        int right = high;
        // 中位数值
        int median = arr[left];
        while (left < right) {
            // 从后向前找到比基准小的元素
            while (left < right && arr[right] >= median) {
                right--;
                arr[left] = arr[right];
            }
            // 从前往后找到比基准大的元素
            while (left < right && arr[left] <= median) {
                left++;
                arr[right] = arr[left];
            }
        }
        // 放置基准值，准备分治递归快排
        arr[left] = median;
        arrSort(arr, low, left - 1);
        arrSort(arr, left + 1, high);
        return arr;
    }
}
