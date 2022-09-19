package com.strategy;

/**
 * @author Janwes
 * @version 1.0
 * @package com.strategy
 * @date 2021/11/3 17:33
 * @description 相减操作
 */
public class SubtractOperation implements AlgorithmStrategy {
    @Override
    public int operation(int val1, int val2) {
        return val1 - val2;
    }
}
