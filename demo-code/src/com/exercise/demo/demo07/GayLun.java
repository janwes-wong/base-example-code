package com.exercise.demo.demo07;

public class GayLun extends Hero implements TrueHurt {

    public GayLun() {
    }

    public GayLun(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void skill1() {
        System.out.println("我的技能1：跳跃");
    }

    @Override
    public void skill2() {
        System.out.println("我的技能2：快跑");
    }

    @Override
    public void skill3() {
        System.out.println("我的技能3：凌波微步");
    }

    @Override
    public void skill4() {
        System.out.println("我的技能4：腾云驾雾");
    }

    @Override
    public void attack() {
        System.out.println("闪电击杀");
    }
}
