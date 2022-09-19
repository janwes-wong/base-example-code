package com.review.collection.set.hashset;

import java.util.HashSet;


/**
 * Set集合：无序无索引不可以重复
 * 不可以重复(保证元素的唯一)
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(3);
        set.add(16);
        set.add(18);
        set.add(39);
        set.add(17);

        System.out.println(set);
    }
}
