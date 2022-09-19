package com.janwes;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes
 * @date 2022/1/8 14:36
 * @description
 */
public class SortTreeMap {
    public static void main(String[] args) {
        treeMapSortBefore();
        treeMapSort();
    }

    private static void treeMapSortBefore() {
        // treeMap默认为升序排序
        Map<String, String> map = new TreeMap<>();
        map.put("d", "dddd");
        map.put("c", "cccc");
        map.put("b", "bbbb");
        map.put("a", "aaaa");
        System.out.println("排序前: " + map);
    }

    private static void treeMapSort() {
        // treeMap默认为升序排序
        /*Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 降序排序
                return o2.compareTo(o1);
            }
        });*/
        Map<String, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("a", "aaaa");
        map.put("b", "bbbb");
        map.put("c", "cccc");
        map.put("d", "dddd");
        System.out.println("排序后: " + map);
    }
}
