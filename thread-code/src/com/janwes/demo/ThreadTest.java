package com.janwes.demo;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.demo
 * @date 2022/6/17 14:20
 * @description
 */
public class ThreadTest {

    public static void main(String[] args) {
        new Thread(() -> doWorkA(), "t1").start();
        new Thread(() -> doWorkB(), "t2").start();
        ThreadTest a = new ThreadTest();
        Class<? extends ThreadTest> c1 = a.getClass();
        Class<? extends Class> c2 = ThreadTest.class.getClass();
        System.out.println(ThreadTest.class.equals(ThreadTest.class.getClasses()));//false
    }

    public static void doWorkA() {
        synchronized (ThreadTest.class) {
            while (true) {
                System.out.println("doWorkA 执行了...... " + System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void doWorkB() {
        synchronized (ThreadTest.class.getClass()) {
            while (true) {
                System.out.println("doWorkB 执行了...... " + System.currentTimeMillis());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
