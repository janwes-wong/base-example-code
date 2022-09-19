package com.janwes.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.demo
 * @date 2022/6/18 17:46
 * @description
 */
public class CallableTest {
    public static void main(String[] args) {
        // FutureTask包装线程任务，FutureTask可以用于获取执行结果
        FutureTask<Integer> futureTask = new FutureTask<>(new CustomCallable());
        // 创建线程对象
        Thread thread = new Thread(futureTask);
        // 执行启动线程
        thread.start();

        try {
            Integer sum = futureTask.get();
            System.out.println("得到线程处理的结果：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /**
     * 一个实现Callable接口返回任务的类
     */
    static class CustomCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
