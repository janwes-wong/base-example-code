package com.thread;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/5/17 15:11
 * @description 该例子用于说明死锁
 */
public class DeadLockTest {
    // 创建资源
    private static Object resourceA = new Object();
    private static Object resourceB = new Object();

    public static void main(String[] args) {
        // 创建线程A
        Thread threadA = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println(Thread.currentThread() + "get resourceA");
                try {
                    // 睡眠10ms
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resourceB");
                synchronized (resourceB) {
                    System.out.println(Thread.currentThread() + "get resourceB");
                }
            }
        });
        // 创建线程B
        Thread threadB = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println(Thread.currentThread() + "get resourceB");
                try {
                    // 睡眠10ms
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "waiting get resourceA");
                synchronized (resourceA) {
                    System.out.println(Thread.currentThread() + "get resourceA");
                }
            }
        });
        // 开启线程
        threadA.start();
        threadB.start();
    }
}
