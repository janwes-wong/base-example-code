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
 * @date 2021/4/27 21:17
 * @description
 */
public class Number {
    private static int sum = 0;
    private static int index = 0;

    /**
     * @param n  线程数
     * @param a1 起始数
     * @param an 结束数
     * @return
     */
    public static synchronized int getSum(int n, int a1, int an) {
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
                synchronized (Number.class) {
                    while (index < an - a1 + 1) {
                        sum += numberArr[index];
                        index++;
                    }
                }
            });
        }
        // 关闭线程池
        poolExecutor.shutdown();
        // 返回结果
        return sum;
    }
}
