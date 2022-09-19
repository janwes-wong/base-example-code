package com.strategy;

/**
 * @author Janwes
 * @version 1.0
 * @package com.strategy
 * @date 2021/11/3 17:35
 * @description 相乘操作
 */
public class MultiplyOperation implements AlgorithmStrategy {
    @Override
    public int operation(int val1, int val2) {
        return val1 * val2;
    }
}
