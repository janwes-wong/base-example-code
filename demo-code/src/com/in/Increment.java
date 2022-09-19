package com.in;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.in
 * @date 2022/4/13 17:27
 * @description 自定义函数式接口
 */
@FunctionalInterface
public interface Increment<T, R> {

    R calculate(T t1, T t2);
}
