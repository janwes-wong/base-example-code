package com.janwes.safety;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.safety
 * @date 2022/6/18 14:54
 * @description
 */
public class SellTicketThread extends Thread {

    /**
     * 实际票数（共享数据）
     */
    public static int ticketCount = 100;

    public SellTicketThread(String name) {
        super(name);
    }

    public SellTicketThread() {
    }

    @Override
    public void run() {
        while (true) {
            // 同步代码块 锁(SellTicketThread.class)
            synchronized (SellTicketThread.class) {
                if (ticketCount > 0) {
                    System.out.println(getName() + "**********正在出售第" + ticketCount + "张票");
                    try {
                        Thread.sleep(100); // 提高安全问题的概率，让线程睡眠
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "  正在出售第" + ticketCount + "张票");
                    ticketCount--;
                }
                System.out.println("票已售罄，请期待下一期......");
            }
        }
    }
}
