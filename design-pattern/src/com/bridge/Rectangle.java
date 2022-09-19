package com.bridge;

/**
 * @author Janwes
 * @version 1.0
 * @package com.bridge
 * @date 2021/11/4 18:10
 * @description
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制长方形...");
        colorApi.paint();
    }
}
