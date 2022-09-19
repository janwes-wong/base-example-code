package com.exercise.demo.demo07;

public class HeroTest {
    public static void main(String[] args) {
        System.out.println("----------以下是带参数构造方法创建对象测试----------");
        GayLun g = new GayLun("Gay伦",25,"男");
        g.show();
        g.skill1();
        g.skill2();
        g.skill3();
        g.skill4();
        g.attack();
        System.out.println("----------");
        ZouDiJi z = new ZouDiJi("走地鸡",22,"男");
        z.show();
        z.skill1();
        z.skill2();
        z.skill3();
        z.skill4();
        System.out.println("----------");
        WaWaYu w = new WaWaYu("娃娃鱼",26,"男");
        w.show();
        w.skill1();
        w.skill2();
        w.skill3();
        w.skill4();
        w.attack();
    }
}
