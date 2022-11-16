package com.observer.mode_2;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.observer.mode_2
 * @date 2022/10/20 9:53
 * @description 抽象观察者
 */
public abstract class AbstractObserver {

    public abstract void receiveMsg(String content);
}
