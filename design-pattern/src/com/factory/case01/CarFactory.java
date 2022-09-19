package com.factory.case01;

public class CarFactory {

    /**
     * 此方法用于创建对象
     *
     * @param brand 汽车的品牌
     *              BMW：代表创建BMW类对象
     *              Benz：代表创建Benz类对象
     *              Audi：代表创建Audi类对象
     *              如果传入参数的brand品牌不正确，表示该汽车工厂无法生产该类汽车，则返回null，出现NullPointerException异常
     * @return 创建的对象
     */
    public Car getInstance(String brand) {
        Car car = null;
        if ("BMW".equals(brand)) {
            car = new BMW();
        } else if ("Benz".equals(brand)) {
            car = new Benz();
        } else if ("Audi".equals(brand)) {
            car = new Benz();
        }

        return car;
    }
}
