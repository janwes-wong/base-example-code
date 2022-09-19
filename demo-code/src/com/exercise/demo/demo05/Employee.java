package com.exercise.demo.demo05;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private double salary;

    //创建空参构造方法
    public Employee() {
    }

    //创建全参构造方法
    public Employee(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    //定义一个工作方法
    public void work() {
        System.out.println("员工在工作");
    }

    //打印输出展示成员变量(本方法可写也可不写)
    public void show() {
        System.out.println(name + "---" + age + "---" + gender + "---" + salary);
    }
}
