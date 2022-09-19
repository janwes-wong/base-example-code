package com.factory.case01;

public class Benz implements Car {

    @Override
    public void run() {
        System.out.println("奔驰4驱百米加速4s");
    }

    @Override
    public void madeInCountry() {
        System.out.println("产自中国");
    }
}
