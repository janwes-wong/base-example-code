package com.singleton;

/**
 * @author Janwes
 * @version 1.0
 * @package com.singleton_pattern
 * @date 2021/4/26 11:11
 * @description 饿汉式-单例设计模式
 */
public class HungrySingleton {
    // 私有化构造方法
    private HungrySingleton() {
    }
    // 在该类内部产生一个唯一的实例化对象，并且将其封装为private static类型的成员变量
    private static final HungrySingleton instance = new HungrySingleton();

    // 定义一个静态方法返回唯一对象
    private static HungrySingleton getInstance() {
        return instance;
    }
}
