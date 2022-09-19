package com.singleton;

/**
 * @author Janwes
 * @version 1.0
 * @package com.singleton_pattern
 * @date 2021/4/26 11:26
 * @description 单例设计模式-懒汉式改造版
 * 线程安全 效率低
 */
public class Lazy {
    // 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象
    private static Lazy instance = null;

    // 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象
    private Lazy() {
    }

    /**
     * 定义一个静态同步(synchronized关键字)方法返回该唯一对象，当调用该方法时才实例化对象
     * 线程安全
     *
     * @return 唯一实例对象
     */
    private static synchronized Lazy getInstance() {
        if (instance == null) {
            instance = new Lazy();
        }
        return instance;
    }
}
