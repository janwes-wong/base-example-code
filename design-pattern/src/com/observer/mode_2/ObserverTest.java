package com.observer.mode_2;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.observer.mode_2
 * @date 2022/10/20 13:08
 * @description
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver());
        subject.sendMsg("hello welcome to my store");
    }
}
