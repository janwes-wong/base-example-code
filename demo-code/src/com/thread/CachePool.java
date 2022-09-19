package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/27 15:21
 * @description 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
 */
public class CachePool {
    public static void main(String[] args) {
        // 利用线程池工具类Executors创建线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                for (int j = 0; j < 10; j++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + j);
                }
            });
        }
        // 关闭线程池
        executorService.shutdown();
    }
}
