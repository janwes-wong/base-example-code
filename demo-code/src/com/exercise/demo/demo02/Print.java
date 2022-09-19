package com.exercise.demo.demo02;

public class Print implements USB{         //创建Print打印类
    //重写USB接口方法
    //重写start()方法
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }
    //重写stop()方法
    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
