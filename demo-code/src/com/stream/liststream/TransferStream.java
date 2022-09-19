package com.stream.liststream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.liststream
 * @date 2021/5/20 22:56
 * @description
 */
public class TransferStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("春");
        list.add("夏");
        list.add("秋");
        list.add("冬");
        // 集合转换成stream流
        Stream<String> list2Stream = list.stream();

        // 数组转换成stream流
        Stream<Integer> arr2Stream = Stream.of(1, 2, 3, 4, 5);

        // 可变参数传递数组
        int[] arr = {1, 2, 3, 4, 5};
        Stream<int[]> stream = Stream.of(arr);
    }
}
