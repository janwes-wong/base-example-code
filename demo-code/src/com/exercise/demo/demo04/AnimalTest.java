package com.exercise.demo.demo04;

public class AnimalTest {
    public static void main(String[] args) {
        //创建波斯猫PersianCat类对象
        PersianCat p = new PersianCat();
        p.eat();            //调用父类的eat方法
        p.drinkWater();     //调用Animal间接父类的drinkWater方法
        p.catchMouse();     //调用Cat父类的catchMouse方法
    }
}
