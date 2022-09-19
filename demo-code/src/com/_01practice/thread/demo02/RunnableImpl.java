package com._01practice.thread.demo02;

public class RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable的新线程!");
    }
}
