package com._01practice.thread.demo01;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread开启了新线程");
    }
}