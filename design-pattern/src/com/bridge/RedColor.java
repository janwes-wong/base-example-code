package com.bridge;

/**
 * @author Janwes
 * @version 1.0
 * @package com.bridge
 * @date 2021/11/4 18:04
 * @description
 */
public class RedColor implements ColorApi {
    @Override
    public void paint() {
        System.out.println("涂上红色...");
    }
}
