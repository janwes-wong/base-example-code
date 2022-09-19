package com.exercise.demo.demo05;

public class EmployeeTest {
    public static void main(String[] args) {
        //创建JavaEECoder子类对象
        JavaEECoder jc = new JavaEECoder("欧阳锋",22,"男",10000.0);
        jc.show();
        jc.work();

        System.out.println("------------------");
        //
        AndroidCoder ac = new AndroidCoder("张三丰",23,"男",11000.0);
        ac.show();
        ac.work();

        System.out.println("------------------");
        //
        Manager manager = new Manager("张无忌",25,"男",12000.5,10000.6);
        manager.show();
        manager.work();
    }
}
