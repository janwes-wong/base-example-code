package com.thread;

/**
 * @author Janwes
 * @version 1.0
 * @package com.thread
 * @date 2021/4/12 21:49
 * @description
 */
public class ExecuteThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("开始卖票，卖出" + i + "张");
                }
            }
        }).start();
    }
}
