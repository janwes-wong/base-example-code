package com.stack.sort;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 17:28
 * @description 顺序栈 基于数组实现 数组栈
 */
public class SeqStack<T> implements Stack<T>, Serializable {

    private static final long serialVersionUID = -5413303117698554397L;

    /**
     * 栈顶指针，-1代表空栈
     */
    private int top = -1;

    /**
     * 容量大小默认为10
     */
    private int capacity = 10;

    /**
     * 存放元素的数组
     */
    private Object[] array;

    /**
     * 数组的大小
     */
    private int size;

    public SeqStack() {
        array = new Object[this.capacity];
    }

    public SeqStack(int capacity) {
        array = new Object[capacity];
    }

    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return this.top == -1;
    }

    @Override
    public void push(T data) {
        // 判断容量是否充足
        if (array.length == size) {
            ensureCapacity(size * 2 + 1);
        }
        // 从栈顶添加元素
        array[++top] = data;
        size++;
    }

    /**
     * 获取栈顶元素的值,不删除
     *
     * @return
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) array[top];
    }

    /**
     * 从栈顶(顺序表尾部)删除
     *
     * @return
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        size--;
        return (T) array[top--];
    }

    /**
     * 扩容的方法
     *
     * @param capacity
     */
    public void ensureCapacity(int capacity) {
        // 如果需要扩容的容量比当前的容量小则不进行扩容
        if (capacity < size) {
            return;
        }
        Object[] oldArr = array;
        array = new Object[capacity];
        if (size >= 0) System.arraycopy(oldArr, 0, array, 0, size);
    }
}
