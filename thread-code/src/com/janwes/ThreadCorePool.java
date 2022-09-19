package com.janwes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.IntStream;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/3/15 16:53
 * @description 自定义核心线程池
 */
public class ThreadCorePool {

    /**
     * 默认阻塞队列大小
     */
    private static final int DEFAULT_WORKQUEUE_SIZE = 5;

    /**
     * 模拟实际的线程池使用阻塞队列来实现生产者-消费者模式
     */
    private static BlockingQueue<Runnable> workQueue;

    /**
     * 模拟实际的线程池使用List集合保存线程池内部的工作线程
     */
    private List<WorkThread> workThreads = new ArrayList<>();

    /**
     * 在ThreadCorePool的构造方法中传入线程池的大小
     *
     * @param poolSize
     */
    public ThreadCorePool(int poolSize) {
        this(poolSize, new LinkedBlockingDeque<>(DEFAULT_WORKQUEUE_SIZE));
    }

    /**
     * 在ThreadCorePool的构造方法中传入线程池的大小和阻塞队列
     *
     * @param poolSize
     * @param workQueue
     */
    public ThreadCorePool(int poolSize, BlockingQueue<Runnable> workQueue) {
        this.workQueue = workQueue;
        IntStream.range(0, poolSize).forEach(i -> {
            WorkThread workThread = new WorkThread();
            workThread.start();
            workThreads.add(workThread);
        });
    }

    /**
     * 通过线程池执行任务
     *
     * @param task
     */
    public void execute(Runnable task) {
        try {
            workQueue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 内部类 模拟线程池的工作线程
     */
    static class WorkThread extends Thread {
        @Override
        public void run() {
            // 不断循环获取队列中的任务
            while (true) {
                // 当没有任务，阻塞
                try {
                    Runnable task = workQueue.take();
                    task.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
