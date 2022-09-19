package com.thread;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/20 10:38
 * @description 守护式进程
 */
public class DaemonThread {
    public static void main(String[] args) {
        // 守护式线程
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(200);
                    System.out.println("线程t1 输出：" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // 设置为守护线程
        t1.setDaemon(true);
        t1.start();

        // 用户线程
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(50);
                    System.out.println("线程t2 输出：" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t2.start();
    }
}
