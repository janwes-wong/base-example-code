package com.observer.mode_2;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.observer.mode_2
 * @date 2022/10/20 13:06
 * @description 具体观察者
 */
public class ConcreteObserver extends AbstractObserver {

    private String content;

    public String getContent() {
        return content;
    }

    @Override
    public void receiveMsg(String content) {
        this.content = content;
        System.out.println("===> 具体观察者接收消息:" + content);
    }
}
