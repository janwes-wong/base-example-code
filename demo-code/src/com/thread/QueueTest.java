package com.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/27 15:03
 * @description
 */
public class QueueTest {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new SynchronousQueue<>();
        // 生产者线程
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    System.out.println("loading data载入数据：" + i);
                    queue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 消费者线程
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("2s后获取数据");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 执行线程
        producer.start();
        consumer.start();
    }
}
