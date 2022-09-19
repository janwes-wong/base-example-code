package com.observer;

/**
 * @author Janwes
 * @version 1.0
 * @package com.view
 * @date 2021/11/4 17:04
 * @description
 */
public class GoodFriendObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("good friend early see you send message,the message content is " + message);
    }
}
