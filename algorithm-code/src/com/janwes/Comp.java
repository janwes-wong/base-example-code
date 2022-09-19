package com.janwes;

import java.util.Arrays;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes
 * @date 2022/1/27 15:59
 * @description
 */
public class Comp {
    public static void main(String[] args) {
        System.out.println(getMaxOfList());
        System.out.println(getMaxOfArray());
    }

    /**
     * 获取list集合中元素的最大值（原始方式）
     *
     * @return
     */
    private static int getMaxOfList() {
        List<Integer> nums = Arrays.asList(8, 4, 6, 55, 42, 81, 61, 37);
        Integer temp = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > temp) {
                temp = nums.get(i);
            }
        }
        return temp;
    }

    /**
     * 获取数组中元素的最大值
     *
     * @return
     */
    private static int getMaxOfArray() {
        int[] arr = {8, 4, 6, 55, 42, 42, 66, 37};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}
