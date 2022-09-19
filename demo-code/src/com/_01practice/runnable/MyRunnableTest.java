package com._01practice.runnable;

public class MyRunnableTest {
    public static void main(String[] args) {
        // 可以通过匿名对象开启线程
        //new Thread(new MyRunnable()).start();

        // 创建 MyRunnable对象
        MyRunnable mr = new MyRunnable();
        // 创建线程对象
        Thread thread = new Thread(mr);
        // 开启线程
        thread.start();
    }
}
