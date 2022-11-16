package com.observer.mode_1;

/**
 * @author Janwes
 * @version 1.0
 * @package com.view
 * @date 2021/11/4 17:06
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        // 添加好友
        concreteSubject.attach(new GoodFriendObserver());
        GoodFriendObserver newFriend = new GoodFriendObserver();
        concreteSubject.attach(newFriend);

        // 发送动态 通知所有订阅者
        concreteSubject.notifyObservers("公告：今晚加班...");
        // 删除好友，发布不良信息
        concreteSubject.detach(newFriend);
        concreteSubject.notifyObservers("公告：今晚不加班，赶紧回家...");
    }
}
