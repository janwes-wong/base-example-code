package com.janwes;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes
 * @date 2022/1/8 15:00
 * @description
 */
public class SortHashMap {
    public static void main(String[] args) {
        // hashMap默认没有排序功能，它是根据key的hashcode实现排序的
        Map<String, Integer> map = new HashMap<>();
        hashMapSortBefore(map);
        hashMapSort(map);
    }

    private static void hashMapSortBefore(Map<String, Integer> map) {
        map.put("a", 4);
        map.put("b", 2);
        map.put("c", 1);
        map.put("d", 3);
        System.out.println(map);
    }

    private static void hashMapSort(Map<String, Integer> map) {
        map.put("a", 4);
        map.put("b", 2);
        map.put("c", 1);
        map.put("d", 3);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        // 使用list集合接口本身的方法排序
        entries.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println(entries);

        // 使用stream流排序
        List<Map.Entry<String, Integer>> collect = entries.stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue)).collect(Collectors.toList());

        // 使用Collections工具类排序
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                // 升序排序
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println(collect);
        System.out.println(entries);
    }
}
