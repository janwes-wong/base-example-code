package com.exercise.demo.demo06;

public abstract class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //声明一个抽象方法
    public abstract void eat();

    public void drinkWater(){
        System.out.println("喝水");
    }
}
