package com._01practice.thread.demo02;

public class ThreadTest {
    public static void main(String[] args) {
        RunnableImpl ri = new RunnableImpl();
        Thread t = new Thread(ri);
        t.start();
    }
}
