package com.exercise.demo.demo05;

public class JavaEECoder extends Coder {
    //创建空参构造方法
    public JavaEECoder() {
    }

    //创建全参构造方法
    public JavaEECoder(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
    }

    //重写Employee父类work方法
    @Override
    public void work() {
        System.out.println("程序员在写JavaEE服务器代码");
    }
}
