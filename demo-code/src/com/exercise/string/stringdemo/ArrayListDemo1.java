package com.exercise.string.stringdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素到集合中
        list.add("小丹丹");
        list.add("小诗诗");
        list.add("小彤彤");
        //修改集合指定的索引元素
        list.set(0,"小海豚");
        //打印集合中的元素
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
