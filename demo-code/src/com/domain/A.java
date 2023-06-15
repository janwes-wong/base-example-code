package com.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.domain
 * @date 2023/3/6 15:17
 * @description
 */
public class A {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");

        list.add(0,"B");
        System.out.println(list);
    }
}
