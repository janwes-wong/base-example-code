package com.strategy;

/**
 * @author Janwes
 * @version 1.0
 * @package com.strategy
 * @date 2021/11/3 17:47
 * @description
 */
public class Context {

    private final AlgorithmStrategy algorithmStrategy;

    public Context(AlgorithmStrategy algorithmStrategy) {
        this.algorithmStrategy = algorithmStrategy;
    }

    public int executeStrategy(int val1, int val2) {
        return algorithmStrategy.operation(val1, val2);
    }
}
