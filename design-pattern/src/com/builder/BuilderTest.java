package com.builder;

/**
 * @author Janwes
 * @version 1.0
 * @package com.builder
 * @date 2021/11/4 9:35
 * @description
 */
public class BuilderTest {
    public static void main(String[] args) {
        ResourcePoolConfig resourcePoolConfig = new ResourcePoolConfig.Builder()
                .setName("connectionPool")
                .setMaxTotal(50)
                .setMaxIdle(10)
                .setMinIdle(10)
                .build();
    }
}
