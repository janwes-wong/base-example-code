package com.stack.sort;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stack.sort
 * @date 2021/5/18 20:31
 * @description
 */
public class LinkedStackTest {
    public static void main(String[] args) {
        LinkedStack<String> sl = new LinkedStack<>();
        sl.push("A");
        sl.push("B");
        sl.push("C");
        int length = sl.size();
        System.out.println(length);
        for (int i = 0; i < length; i++) {
            System.out.println("sl.pop->" + sl.pop());
        }
    }
}
