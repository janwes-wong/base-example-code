package com.factory.case01;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        // 宝马
        Car bmw = factory.getInstance("BMW");
        bmw.run();
        bmw.madeInCountry();

        // 奔驰
        Car benz = factory.getInstance("Benz");
        benz.run();
        benz.madeInCountry();

        // 奥迪
        Car audi = factory.getInstance("Aud");
        audi.run();
        audi.madeInCountry();
    }
}
