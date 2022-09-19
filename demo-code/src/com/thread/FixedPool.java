package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/27 15:28
 * @description 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待
 */
public class FixedPool {
    public static void main(String[] args) {
        // 利用线程池工具类Executors创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 10; j++) {
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }
        executorService.shutdown();
    }
}
