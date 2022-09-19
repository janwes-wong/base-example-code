package com.singleton;

/**
 * @author Janwes
 * @version 1.0
 * @package com.singleton_pattern
 * @date 2021/4/26 11:20
 * @description 单例设计模式-饿汉式变换写法
 */
public class Hungry {
    // 私有化构造方法
    private Hungry() {
    }

    // 私有化静态成员变量
    private static Hungry instance = null;

    // 静态代码块，类加载时创建唯一实例化对象
    static {
        instance = new Hungry();
    }

    // 定义一个静态方法返回唯一对象
    private static Hungry getInstance() {
        return instance;
    }
}
