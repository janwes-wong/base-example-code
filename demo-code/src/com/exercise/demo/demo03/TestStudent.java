package com.exercise.demo.demo03;

public class TestStudent {
    public static void main(String[] args) {
        //创建对象
        //创建对象格式： 类名 对象名 = new 类名();
        Student stu = new Student();
        //使用对象访问类中的成员变量 ===> 对象名.成员变量();
        //使用对象访问类中的成员方法 ===> 对象名.成名方法();
        System.out.println(stu);//对象stu的内存地址:com.exercise.demo.demo03.Student@b4c966a
        //给成员变量赋值
        stu.name = "李雷";
        stu.age = 25;
        System.out.println("我的名字叫"+ stu.name);
        System.out.println("我今年"+ stu.age+"岁了");
        /*
        调用成员方法:
        1.直接调用
        2.赋值调用
        3.输出调用
        */
        stu.eat();
        stu.study();
        stu.study("韩梅梅");
        stu.study("列夫托尔斯泰",100);
        //System.out.println(stu.study("韩梅梅"));
    }
}