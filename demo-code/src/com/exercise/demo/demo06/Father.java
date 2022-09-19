package com.exercise.demo.demo06;

public class Father {
    private String name;
    private int age;

    public Father() {
        System.out.println("Father父类的空参构造方法被调用了.....");
    }

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Father父类的有参构造方法被调用了.....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
