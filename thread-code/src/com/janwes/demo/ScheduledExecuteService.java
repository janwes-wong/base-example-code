package com.janwes.demo;

import java.time.LocalDateTime;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.demo
 * @date 2022/10/9 16:49
 * @description
 */
public class ScheduledExecuteService {

    // 单线程情况
    public static final ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1);

    // 多线程情况
    /*static {
        executorService = new ScheduledThreadPoolExecutor(5, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                thread.setName("task-call-service");
                return thread;
            }
        });
    }*/

    public static void main(String[] args) {
        // 根据延迟时间和执行时间只执行一次任务
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("===> 我只执行一次任务");
            }
        }, 1000, TimeUnit.MILLISECONDS);
        // 循环任务，按照上一次任务的发起时间计算下一次任务的开始时间
        executorService.scheduleWithFixedDelay(new Task(), 1000, 1000, TimeUnit.MILLISECONDS);
    }

    static class Task implements Runnable {

        @Override
        public void run() {
            try {
                long threadId = Thread.currentThread().getId();
                String threadName = Thread.currentThread().getName();
                System.out.println("===> " + threadId + " , " + threadName + " , " + LocalDateTime.now().toLocalTime().toString() + " 开始计算......");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
