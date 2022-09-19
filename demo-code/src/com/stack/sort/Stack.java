package com.stack.sort;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 17:21
 * @description
 */
public interface Stack<T> {

    /**
     * 栈是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * data元素入栈
     *
     * @param data
     */
    void push(T data);

    /**
     * 返回栈顶元素，未出栈
     *
     * @return
     */
    T peek();

    /**
     * 出栈，返回栈顶元素，同时从栈中移除该元素
     *
     * @return
     */
    T pop();
}
