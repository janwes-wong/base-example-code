package com.strategy;

/**
 * @author Janwes
 * @version 1.0
 * @package com.strategy
 * @date 2021/11/3 17:36
 * @description
 */
public class DivideOperation implements AlgorithmStrategy {
    @Override
    public int operation(int val1, int val2) {
        if (val2 == 0) {
            // 除数不能为0，无意义
            throw new IllegalArgumentException("The divisor cannot be zero...");
        }
        return val1 / val2;
    }
}
