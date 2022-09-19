package com.stream.listsort_03;

import java.util.ArrayList;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.listsort_03
 * @date 2021/5/19 17:37
 * @description
 */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("我");
        list.add("爱");
        list.add("中");
        list.add("国");
        System.out.println(list.stream().count());
    }
}
