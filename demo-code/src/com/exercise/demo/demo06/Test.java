package com.exercise.demo.demo06;

public class Test {
    public static void main(String[] args) {
        //创建Son子类对象，调用子类空参构造方法-->在子类空参构造方法JVM默认super()调用Father父类的空参构造方法
        //在继承中，构造方法无法被子类继承，但可以被子类调用
        Son son = new Son();
        System.out.println("---------------");
        //创建Son子类对象并传入参数，调用子类有参构造方法
        Son s = new Son("胡彭狗友",25);
    }
}
