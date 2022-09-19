package com.domain;

public class Student {
    //创建私有成员变量
    private String name;
    private int age;
    private String gender;
    private double height;

    //创建空参构造方法
    public Student(){

    }

    //创建有参构造方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //创建set方法，为成员变量name赋值
    public void setName(String name){
        this.name = name;
    }

    //创建get方法，获取成员变量name的值
    public String getName(){
        return name;
    }

    //创建set方法，为成员变量age赋值
    public void setAge(int age){
        this.age = age;
    }

    //创建set方法，获取成员变量age的值
    public int getAge(){
        return age;
    }

    //创建show方法，打印输出测试
    public void show(){
        System.out.println(this.name+"--"+this.age);
        System.out.println(getName()+"--"+getAge());
    }
}
