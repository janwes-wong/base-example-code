package com.singleton;

/**
 * @author Janwes
 * @version 1.0
 * @package com.singleton_pattern
 * @date 2021/4/26 11:27
 * @description 单例设计模式-懒汉式
 * 此种方式在调用getInstance()方法时才会创建对象，线程不安全
 */
public class LazySingleton {
    // 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象
    private static LazySingleton instance = null;

    // 将构造方法私有化，使其不能在类的外部通过new关键字实例化该类对象
    private LazySingleton() {
    }

    // 定义一个静态方法返回该唯一对象，当调用该方法时才实例化对象
    private static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
