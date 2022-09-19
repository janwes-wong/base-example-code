package com.exercise.demo.demo07;

public abstract class Hero {
    private String name;
    private int age;
    private String gender;

    public Hero() {
    }

    public Hero(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void skill1();

    public abstract void skill2();

    public abstract void skill3();

    public abstract void skill4();

    public void show(){
        System.out.println("姓名："+getName()+"---年龄："+getAge()+"---性别："+getGender());
    }
}
