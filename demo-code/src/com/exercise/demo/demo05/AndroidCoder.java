package com.exercise.demo.demo05;

public class AndroidCoder extends Coder {

    //创建空参构造方法
    public AndroidCoder() {
    }

    //创建全参构造方法
    public AndroidCoder(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
    }

    //重写Employee父类work方法
    @Override
    public void work() {
        System.out.println("安卓程序员在编写Android代码");
    }
}
