package com.exercise.demo.demo02;

public class InterfaceTest {
    public static void main(String[] args) {
        Computer.plugin(new Flash());       //插入U盘
        Computer.plugin(new Print());       //插入打印机
    }
}
