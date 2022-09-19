package com.gc;

/**
 * @author Janwes
 * @version 1.0
 * @package com.gc
 * @date 2021/4/21 20:37
 * @description
 */
public class GCRootTest {
    public static void main(String[] args) {
        MethodAreaConstants methodAreaConstants = new MethodAreaConstants("final");
        methodAreaConstants = null;
    }
}
