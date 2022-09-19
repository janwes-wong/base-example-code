package com.exercise.demo.demo04;

public class Dog extends Animal{
    public void lookHome(){
        System.out.println("狗看家");
    }


    //重写Animal父类eat方法
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
