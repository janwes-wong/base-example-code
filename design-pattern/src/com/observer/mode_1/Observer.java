package com.observer.mode_1;

/**
 * @author Janwes
 * @version 1.0
 * @package com.view
 * @date 2021/11/4 16:55
 * @description 订阅者/观察者接口
 */
public interface Observer {

    /**
     * 处理逻辑
     */
    void update(String message);
}
