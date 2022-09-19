package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0
 * @package com.test
 * @date 2021/4/15 18:01
 * @description
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        // 使用迭代器循环遍历删除
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (value.equals("B") || value.equals("C")) {
                iterator.remove();
            }
        }
        System.out.println(list);

        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        System.out.println(lists);
        Iterator<Integer> it = lists.iterator();
        /*while (it.hasNext()) {
            Integer next = it.next();
            if (next==3)
            it.remove();
        }*/
        for (Integer integer : lists) {
            if (integer == 3) {
                lists.remove(integer);
            }
        }
        System.out.println(lists);
    }
}
