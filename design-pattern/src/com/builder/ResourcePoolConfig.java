package com.builder;

/**
 * @author Janwes
 * @version 1.0
 * @package com.builder
 * @date 2021/11/3 18:21
 * @description 资源池配置类 采用建造者模式实现
 */
public class ResourcePoolConfig {

    /**
     * 资源池名称
     */
    private String name;

    /**
     * 最大资源数量
     */
    private int maxTotal;

    /**
     * 最大空闲资源数量
     */
    private int maxIdle;

    /**
     * 最小空闲资源数量
     */
    private int minIdle;

    /**
     * 私有构造
     */
    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {

        /**
         * 默认最大资源数量
         */
        private static final int DEFAULT_MAX_TOTAL = 8;

        /**
         * 默认最大空闲资源数量
         */
        private static final int DEFAULT_MAX_IDLE = 8;

        /**
         * 默认最小空闲资源数量
         */
        private static final int DEFAULT_MIN_IDLE = 0;

        private String name;

        private int maxTotal = DEFAULT_MAX_TOTAL;

        private int maxIdle = DEFAULT_MAX_IDLE;

        private int minIdle = DEFAULT_MIN_IDLE;

        public ResourcePoolConfig build() {
            // 校验逻辑判断
            if (name == null || name.equals("")) {
                throw new IllegalArgumentException("resource pool name can not be empty...");
            }
            // 等等
            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            if (name == null || name.equals("")) {
                throw new IllegalArgumentException("resource pool name can not be empty...");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal < 0) {
                throw new IllegalArgumentException("resource pool maxTotal can not be less then zero...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxTotal < 0) {
                throw new IllegalArgumentException("resource pool maxIdle can not be less then zero...");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (maxTotal < 0) {
                throw new IllegalArgumentException("resource pool minIdle can not be less then zero...");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}
