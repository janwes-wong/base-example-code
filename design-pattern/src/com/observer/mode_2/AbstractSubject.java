package com.observer.mode_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.observer.mode_2
 * @date 2022/10/20 12:50
 * @description 抽象主题（抽象被观察者角色）
 */
public abstract class AbstractSubject {

    /**
     * 持有所有抽象观察者角色的集合
     */
    private List<AbstractObserver> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void removeObserver(AbstractObserver observer) {
        Iterator<AbstractObserver> iterator = observers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == observer) {
                iterator.remove();
            }
        }
    }

    /**
     * 通知所有的观察者 执行观察者更新方式
     *
     * @param content
     */
    public void notifyAllObserver(String content) {
        observers.forEach(observer -> observer.receiveMsg(content));
    }
}
