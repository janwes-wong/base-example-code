package com.stream.listsort_03;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.listsort_03
 * @date 2021/5/19 17:34
 * @description
 */
public class StreamSorted {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(24);
        list.add(32);
        System.out.println("排序前：>>>" + list);
        // 利用Stream流排序
        list = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());
        System.out.println("排序后：>>>" + list);
    }
}
