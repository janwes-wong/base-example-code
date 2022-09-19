package com.exercise.demo.demo07;

public class WaWaYu extends Hero implements TrueHurt {

    public WaWaYu() {
    }

    public WaWaYu(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void skill1() {

    }

    @Override
    public void skill2() {

    }

    @Override
    public void skill3() {

    }

    @Override
    public void skill4() {

    }

    @Override
    public void attack() {
        System.out.println("排山倒海");
    }

}
