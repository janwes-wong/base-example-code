package com.sort;

/**
 * @author Janwes
 * @version 1.0
 * @package com.sort
 * @date 2021/5/3 22:20
 * @description 选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3, 38, 5, 44, 15, 36, 26, 20, 18, 41, 53};
        int[] result = selectionSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] selectionSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
        return array;
    }
}
