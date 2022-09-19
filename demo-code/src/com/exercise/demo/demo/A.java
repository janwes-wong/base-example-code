package com.exercise.demo.demo;

public class A {
    public static void main(String[] args) {
        Person s = new Person();//创建对象==>类名 对象名 = new 类名()
        s.name = "刘德华";      //为属性赋值
        s.age = 25;
        s.gender = '男';
        s.hobby = "爬山";
        s.height = 180.2;
        s.printMessage();
        s.eat();                //调用person类中的eat方法==>对象名.方法名()
        s.sleep();
        s.work();
    }
}
