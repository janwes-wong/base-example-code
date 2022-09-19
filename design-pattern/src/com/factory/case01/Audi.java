package com.factory.case01;

public class Audi implements Car {

    @Override
    public void run() {
        System.out.println("奥迪6驱百米加速3s");
    }

    @Override
    public void madeInCountry() {
        System.out.println("产自意大利");
    }
}
