package com.janwes.safety;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.safety
 * @date 2022/6/18 15:03
 * @description
 */
public class SellTicketThreadTest {
    public static void main(String[] args) {
        new SellTicketThread("A窗口").start();
        new SellTicketThread("B窗口").start();
        new SellTicketThread("C窗口").start();
        new SellTicketThread("D窗口").start();
    }
}
