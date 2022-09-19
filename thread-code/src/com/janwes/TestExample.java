package com.janwes;

import java.util.stream.IntStream;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/3/15 18:06
 * @description 测试自定义线程池
 */
public class TestExample {
    public static void main(String[] args) {
        ThreadCorePool threadCorePool = new ThreadCorePool(10);
        IntStream.range(0, 15).forEach(value -> threadCorePool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " ===>> Hello ThreadCorePool自定义核心线程池");
            }
        }));
    }
}
