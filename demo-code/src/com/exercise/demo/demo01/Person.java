package com.exercise.demo.demo01;

public class Person{
    String name;
    int age;

    //无参构造方法（空参构造方法）
    public Person(){
        System.out.println("正在调用无参构造方法");
    }

    //构造方法允许重载
    public Person(int age){
        System.out.println("正在调用1个参数的有参构造方法");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("正在调用2个参数的有参构造方法");
        System.out.println(this.name+"---"+this.age);
    }
}
