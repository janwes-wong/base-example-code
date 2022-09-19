package com.exercise.demo.demo06;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
}