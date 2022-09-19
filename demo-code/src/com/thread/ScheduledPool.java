package com.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/27 15:37
 * @description 创建一个定长线程池，支持定时及周期性任务执行
 */
public class ScheduledPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("i:" + 1), 2, 10, TimeUnit.SECONDS);
    }
}
