package com.thread;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/27 20:16
 * @description
 */
public class ThreadTest {
    private static int sum = 0;
    private static int index = 0;

    public static void main(String[] args) {
        getSum(6, 5, 100);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }

    /**
     * @param n  线程数
     * @param a1 起始数
     * @param an 结束数
     * @return
     */
    public static void getSum(int n, int a1, int an) {
        // 参与计算的线程个数
        n = Math.min(n, an - a1 + 1);
        //
        int[] numberArr = new int[an - a1 + 1];
        for (int i = 0; i <= (an - a1); i++) {
            numberArr[i] = a1 + i;
        }
        System.out.println(Arrays.toString(numberArr));

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                n,
                n,
                1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i <= n; i++) {
            poolExecutor.execute(() -> {
                while (index < an - a1 + 1) {
                    synchronized (ThreadTest.class) {
                        if (index < an - a1 + 1) {
                            sum += numberArr[index];
                            index++;
                            System.out.println(Thread.currentThread().getName() + ":" + sum);
                        }
                    }
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                poolExecutor.shutdown();
            });
        }
    }
}
