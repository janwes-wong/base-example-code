package com.stack.sort;

import java.io.Serializable;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 19:55
 * @description 链式栈
 */
public class LinkedStack<T> implements Stack<T>, Serializable {

    private static final long serialVersionUID = 1911829302658328353L;

    private Node<T> top;

    private int size;

    public LinkedStack() {
    }

    public LinkedStack(Node<T> top) {
        this.top = top;
    }

    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null || top.data == null;
    }

    @Override
    public void push(T data) {
        if (data == null) {
            throw new StackException("data con't be null");
        }
        if (this.top == null) {
            this.top = new Node<>(data);
        } else if (this.top.data == null) {
            this.top.data = data;
        } else {
            top = new Node<>(data, this.top);
        }
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException("Stack empty");
        }
        return top.data;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException("Stack empty");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }
}
