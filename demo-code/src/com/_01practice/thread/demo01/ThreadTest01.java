package com._01practice.thread.demo01;

public class ThreadTest01 {
    public static void main(String[] args) {
        // 匿名对象开启新线程
        new Thread(new MyThread()).start();

        // 通过匿名内部类开启线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启了一条新线程");
            }
        }).start();


        // lambada写法
        new Thread(() -> System.out.println("开启了一条新线程")).start();
    }
}