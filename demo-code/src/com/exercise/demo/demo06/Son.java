package com.exercise.demo.demo06;

public class Son extends Father {
    public Son(){
        System.out.println("Son子类的空参构造方法.....");
    }

    public Son(String name,int age){
        super(name,age);
        System.out.println("Son子类的有参构造方法.....");
    }
}
