package com.decorative;

/**
 * NormalMan普通人类：被装饰类
 */
public class NormalMan implements Person {
    @Override
    public void eat() {
        System.out.println("早餐150g，中餐吃2碗饭，晚餐吃3碗饭");
    }

    @Override
    public void sleep() {
        System.out.println("一天睡觉8h");
    }

    @Override
    public void fight() {
        System.out.println("Double Kills & 雷霆出击");
    }
}
