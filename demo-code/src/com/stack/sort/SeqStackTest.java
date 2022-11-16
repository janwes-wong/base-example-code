package com.stack.sort;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 18:01
 * @description
 */
public class SeqStackTest {
    public static void main(String[] args) {
        SeqStack<String> stack = new SeqStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("size ---> " + stack.size());
        System.out.println("peek element ---> " + stack.peek());
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println("pop element ---> " + stack.pop());
        }
        System.out.println("peek element ---> " + stack.peek());
    }
}
