package com.exercise.string.stringdemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //创建集合，保存Student类对象
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张学友",25);
        Student stu2 = new Student("梁朝伟",26);
        Student stu3 = new Student("刘德华",27);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        Student stu4 = new Student("郭富城",23);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+list.get(i).getAge());
        }
        //利用集合中的contains方法比较，默认比较的是对象的地址值，如果要比较对象的属性值，需重写Object类equals方法
        boolean result = list.contains(stu1);
        System.out.println(result);//true
        boolean result1 = list.contains(stu4);
        System.out.println(result1);//false
    }
}
