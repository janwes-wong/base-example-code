package com.exercise.string.stringdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //定义包装类型Integer整数类型
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            int result = number + 10;
            System.out.println(result);
        }
    }
}
