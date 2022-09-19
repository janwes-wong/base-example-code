package com.review.map.hashmap;

import java.util.HashMap;

public class HashMapTest01 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(5,"张国荣");
        map.put(4,"张学友");
        map.put(2,"张三丰");
        map.put(6,"张无忌");
        map.put(3,"张智霖");

        System.out.println(map);
    }
}
