package com.queue.seq;

import com.queue.Queue;

/**
 * @author Janwes
 * @version 1.0
 * @package com.queue.seq
 * @date 2021/5/18 22:29
 * @description 顺序队列
 */
public class SeqQueue<T> implements Queue<T> {

    private static final long serialVersionUID = -1664818681270068094L;

    /**
     * 默认队列长度大小
     */
    private static final int DEFAULT_SIZE = 10;

    private T elementData[];

    /**
     * 队头
     */
    private int front;

    /**
     * 队尾
     */
    private int rear;

    /**
     * 队列长度
     */
    private int size;

    public SeqQueue() {
        elementData = (T[]) new Object[DEFAULT_SIZE];
        front = rear = 0;
    }

    public SeqQueue(int capacity) {
        elementData = (T[]) new Object[capacity];
        front = rear = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * data 入队,添加成功返回true,否则返回false,可扩容
     *
     * @param data
     * @return
     */
    @Override
    public boolean add(T data) {
        if (this.front == (this.rear + 1) % this.elementData.length) {
            ensureCapacity(elementData.length * 2 + 1);
        }
        // 添加data
        elementData[this.rear] = data;
        // 更新队头rear指向下一个空元素的位置
        this.rear = (this.rear + 1) % elementData.length;
        size++;
        return true;
    }

    @Override
    public boolean offer(T data) {
        return false;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public void clearQueue() {

    }

    /**
     * 队列的扩容
     *
     * @param capacity
     */
    public void ensureCapacity(int capacity) {
        // 如果需要扩容的容量小于当前数组的容量则不进行扩容操作
        if (capacity > size) {
            T[] oldElement = (T[]) new Object[capacity];
            int j = 0;
            // 复制元素
            for (int i = this.front; i != this.rear; i = (i + 1) % oldElement.length) {
                elementData[j++] = oldElement[i];
            }
            // 恢复front,rear指向
            this.front = 0;
            this.rear = j;
        }
    }
}
