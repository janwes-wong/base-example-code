package com.in;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.in
 * @date 2022/4/13 17:16
 * @description
 */
public interface Call {

    void sound();

    default void sendMsg() {
        System.out.println("send message......");
    }
}
