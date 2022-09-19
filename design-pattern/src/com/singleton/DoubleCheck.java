package com.singleton;

/**
 * @author Janwes
 * @version 1.0
 * @package com.singleton_pattern
 * @date 2021/4/26 11:43
 * @description 单例设计模式-懒汉式双重校验锁
 * 线程安全，延迟加载，效率较高
 */
public class DoubleCheck {
    // 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象
    private static DoubleCheck instance = null;

    // 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象
    private DoubleCheck() {
    }

    /**
     * 定义一个静态方法返回该唯一对象，当调用该方法时才实例化对象
     *
     * @return 唯一实例对象
     */
    private static DoubleCheck getInstance() {
        if (instance == null) {
            // 同步代码块
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
