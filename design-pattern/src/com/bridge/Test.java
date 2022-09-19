package com.bridge;

/**
 * @author Janwes
 * @version 1.0
 * @package com.bridge
 * @date 2021/11/4 18:11
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.setDraw(new BlueColor());
        shape.draw();
    }
}
