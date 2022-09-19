package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/27 14:25
 * @description 线程池运行原理
 */
public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 10, 20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 20; i++) {
            try {
                executor.execute(new CustomRunnable("第" + (i + 1) + "号线程"));
            } catch (Throwable e) {
                System.out.println("丢弃任务AbortPolicy：" + (i + 1));
            }
        }
    }

    static class CustomRunnable implements Runnable {
        private String name;

        public CustomRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name);
            while (true) {

            }
        }
    }
}
