package com.janwes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/9/22 14:46
 * @description
 */
public class ArrayListTest {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("b");
    }
}
