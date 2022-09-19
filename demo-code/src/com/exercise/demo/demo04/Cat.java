package com.exercise.demo.demo04;

public class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }


    //重写Animal父类eat方法
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
}
