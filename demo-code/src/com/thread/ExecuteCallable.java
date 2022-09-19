package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/20 10:22
 * @description
 */
public class ExecuteCallable {
    public static void main(String[] args) {
        // FutureTask包装线程任务，FutureTask可以用于获取执行结果
        FutureTask<Integer> futureTask = new FutureTask<>(new MyCallable());
        // 创建线程对象
        Thread thread = new Thread(futureTask);
        // 执行启动线程
        thread.start();
        try {
            // 获取线程的执行结果
            Integer num = futureTask.get();
            System.out.println("得到线程处理结果：" + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    // 实现Callable接口，实现带返回值的任务
    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int num = 0;
            for (int i = 0; i < 1000; i++) {
                System.out.println("输出" + i);
                num += i;
            }
            return num;
        }
    }
}
