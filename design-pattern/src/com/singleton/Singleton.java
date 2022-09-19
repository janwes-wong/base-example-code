package com.singleton;

/**
 * @author Janwes
 * @version 1.0
 * @package com.singleton_pattern
 * @date 2021/4/26 11:48
 * @description 单例设计模式-静态内部类
 */
public class Singleton {
    private Singleton() {
    }

    // 静态内部类
    private static class SingletonHandler {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHandler.instance;
    }
}
