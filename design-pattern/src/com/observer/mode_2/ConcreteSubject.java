package com.observer.mode_2;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.observer.mode_2
 * @date 2022/10/20 13:01
 * @description 具体被观察者角色
 */
public class ConcreteSubject extends AbstractSubject {

    private String content;

    public String getContent() {
        return content;
    }

    public void sendMsg(String content) {
        this.content = content;
        System.out.println("===> 具体被观察者发送消息:" + content);
        // 通知所有的观察者
        super.notifyAllObserver(content);
    }
}
