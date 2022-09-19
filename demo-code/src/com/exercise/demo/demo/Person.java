package com.exercise.demo.demo;

public class Person {
    String name;
    int age;
    char gender;
    String hobby;
    double height;
    public void printMessage(){
        System.out.println("我的名字叫"+name+",年龄"+age+"岁,"+"爱好是"+hobby+",身高是"+height+"cm");
    }
    public void eat(){
        System.out.println("我正在吃水果");
    }
    public void sleep(){
        System.out.println("我正准备睡觉啦");
    }
    public void work(){
        System.out.println("我要去上班啦");
    }
}
