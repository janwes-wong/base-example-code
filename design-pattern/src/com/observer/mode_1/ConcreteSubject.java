package com.observer.mode_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0
 * @package com.view
 * @date 2021/11/4 17:00
 * @description
 */
public class ConcreteSubject implements Subject {

    /**
     * 订阅者集合
     */
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        // 添加订阅关系
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        // 移除订阅关系
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == observer) {
                iterator.remove();
            }
        }
    }

    @Override
    public void notifyObservers(String message) {
        // 通知所有订阅者
        observers.forEach(o -> o.update(message));
    }
}
