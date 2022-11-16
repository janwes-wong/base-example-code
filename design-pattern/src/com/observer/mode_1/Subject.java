package com.observer.mode_1;

/**
 * @author Janwes
 * @version 1.0
 * @package com.view
 * @date 2021/11/4 16:53
 * @description 主题接口
 */
public interface Subject {

    /**
     * 添加订阅关系
     *
     * @param observer
     */
    void attach(Observer observer);

    /**
     * 移除订阅关系
     *
     * @param observer
     */
    void detach(Observer observer);

    /**
     * 通知所有订阅者
     *
     * @param message
     */
    void notifyObservers(String message);
}
