package com.janwes.safety;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.safety
 * @date 2022/11/16 16:45
 * @description
 */
public class SynchronizeDemo {

    public synchronized void syncMethod() {
        System.out.println("===> 同步方法");
    }

    public void syncBlockMethod() {
        synchronized (this) {
            System.out.println("===> 同步代码块");
        }
    }
}
