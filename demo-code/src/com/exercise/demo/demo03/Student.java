package com.exercise.demo.demo03;

public class Student {
    //成员变量(属性)
    String name;
    int age;
    //成员方法(行为)
    public void study(){
        System.out.println("好好学习,天天向上");
    }
    public void study(String name){
        System.out.println(name+"正在学校上课");
        System.out.println(this.name+"正在学校上课");
    }
    public void study(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    public void eat(){
        System.out.println("我要去吃饭咯");
    }
}