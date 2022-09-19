package com.factory.case01;

public class BMW implements Car {

    @Override
    public void run() {
        System.out.println("宝马4驱百米加速2s");
    }

    @Override
    public void madeInCountry() {
        System.out.println("产自德国");
    }
}
