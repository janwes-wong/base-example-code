package com.exercise.demo.demo02;

public class Flash implements USB{      //创建U盘类
    //重写USB接口方法
    //重写start()方法
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }
    //重写stop()方法
    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
