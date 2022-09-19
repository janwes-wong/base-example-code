package com.bridge;

/**
 * @author Janwes
 * @version 1.0
 * @package com.bridge
 * @date 2021/11/4 18:08
 * @description
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆形...");
        colorApi.paint();
    }
}
