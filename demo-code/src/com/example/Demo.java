package com.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.example
 * @date 2021/8/12 10:04
 * @description
 */
public class Demo {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        System.out.println(hashMap);
        list.stream().map(e -> hashMap.put(e, e));
        System.out.println(hashMap);

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        List<Integer> collect = nums.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect);
    }
}
