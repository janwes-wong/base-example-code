package com.sort;

/**
 * @author Janwes
 * @version 1.0
 * @package com.sort
 * @date 2021/5/3 21:31
 * @description 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 38, 5, 44, 15, 36, 26, 5, 18, 41, 53};
        int[] result = bubbleSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
