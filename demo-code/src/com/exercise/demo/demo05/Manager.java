package com.exercise.demo.demo05;

public class Manager extends Employee {
    //定义一个私有化成员变量bonus，为奖金
    private double bonus;

    //创建空参构造方法
    public Manager() {
    }

    //创建全参构造方法
    public Manager(String name, int age, String gender, double salary, double bonus) {
        super(name, age, gender, salary);
        this.bonus = bonus;
    }

    //定义set和get方法，为成员变量bonus赋值及获取成员变量bonus的数值
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    //重写Employee父类work方法
    @Override
    public void work() {
        System.out.println("项目经理在监督程序员工作");
    }

    //重写Employee父类show方法
    @Override
    public void show() {
        super.show();
        System.out.println("项目经理的奖金为：" + bonus);
    }
}
