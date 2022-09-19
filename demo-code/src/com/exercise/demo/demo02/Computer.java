package com.exercise.demo.demo02;

public class Computer {
    public static void plugin(USB usb){
        usb.start();
        System.out.println("-----USB设备工作-----");
        usb.stop();
    }
}
