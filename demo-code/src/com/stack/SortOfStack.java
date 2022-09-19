package com.stack;

import java.util.Stack;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack
 * @date 2021/4/29 14:08
 * @description 对栈的元素进行排序
 */
public class SortOfStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(24);
        stack.push(32);
        stack.push(12);
        stack.push(0);
        stack.push(7);
        stack.push(-8);
        System.out.println("排序前：" + stack);
        sortOfStack(stack);
        System.out.println("排序后：" + stack);
    }

    public static void sortOfStack(Stack<Integer> stack) {
        Stack<Integer> st = new Stack<>();
        while (!stack.isEmpty()) {
            Integer currentEle = stack.pop();
            while (!st.isEmpty() && st.peek() < currentEle) {
                stack.push(st.pop());
            }
            st.push(currentEle);
        }
        while (!st.isEmpty()) {
            stack.push(st.pop());
        }
    }
}
