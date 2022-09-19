package com.exercise.string.stringdemo;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();

        String s1 = "刘备";
        String s2 = "关羽";
        String s3 = "张飞";
        String s4 = "曹操";

        System.out.println(list);//输出打印不出来集合里面的内容
        //将对象作为元素添加到集合--------增
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //public E get(int index):返回指定索引处的元素
        System.out.println("get:"+list.get(0));
        System.out.println("get:"+list.get(1));
        System.out.println("get:"+list.get(2));
        System.out.println("get:"+list.get(3));

        //打印集合的个数
        System.out.println("size:"+list.size());

        //public E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println("被删除的元素:"+list.remove(0));

        System.out.println(list);//输出打印不出来集合里面的内容
        //遍历输出集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));//因为index索引为0的“刘备”被删除，所以只打印3个数
        }
    }
}