package com.thread;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/20 10:57
 * @description
 */
public class InterruptThread {
    public static void main(String[] args) {
        // 创建线程对象
        Thread thread = new Thread(() -> {
            while (true) {
                // 判断当前线程是否中断的状态
                boolean interrupted = Thread.currentThread().isInterrupted();
                if (interrupted) {
                    System.out.println("当前线程为中断状态");
                } else {
                    System.out.println("线程执行中.....");
                }
            }
        });
        // 执行启动线程
        thread.start();
        try {
            // 睡眠
            Thread.sleep(2000);
            // 中断线程
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
