package com.janwes.demo;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.demo
 * @date 2022/6/17 17:38
 * @description
 */
public class ThreadTestA {

    public static int count = 0;//499500

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count += i;
                }
                System.out.println(count);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count += i;
                }
                System.out.println(count);
            }
        }).start();
    }

    public static void calculateA() {
        for (int i = 0; i < 1000; i++) {
            count += i;
        }
    }

    public static void calculateB() {

    }
}
