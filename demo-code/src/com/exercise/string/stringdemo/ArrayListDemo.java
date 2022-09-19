package com.exercise.string.stringdemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加元素到集合中
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //打印集合中的元素
        System.out.println(list);
        //第一种方法：删除集合指定的索引元素
        list.remove(0);
        //第一种方法：删除集合指定的元素
        //list.remove("ccc")
        System.out.println(list);
        //修改集合指定的索引元素
        list.set(1,"你来打我呀!");
        System.out.println(list);
    }
}
