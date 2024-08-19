package com.stream;

import java.util.*;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2022/1/24 16:12
 * @description
 */
public class DifferentTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C", "X", "Y", "Z");
        List<String> list2 = Arrays.asList( "C", "D", "E", "F", "G");
        System.out.println(getDifferent(list1, list2));

        List<String> results = new ArrayList<>();
        for (String s : list1) {
            if (!list2.contains(s)) {
                results.add(s);
            }
        }
        System.out.println(results);
    }

    private static List<String> getDifferent(List<String> list1, List<String> list2) {
        List<String> sameEle = getSameEle(list1, list2);
        Map<String, Integer> map = new HashMap<>();
        List<String> diff = new ArrayList<>();
        List<String> maxList = sameEle;
        List<String> minList = list2;
        if (list2.size() > sameEle.size()) {
            maxList = list2;
            minList = sameEle;
        }
        for (String string : maxList) {
            map.put(string, 1);
        }
        for (String string : minList) {
            Integer value = map.get(string);
            if (value != null) {
                map.put(string, ++value);
                continue;
            }
            map.put(string, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                diff.add(entry.getKey());
            }
        }
        return diff;

    }

    private static List<String> getSameEle(List<String> list1, List<String> list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> diff = new ArrayList<>();
        List<String> maxList = list1;
        List<String> minList = list2;
        if (list2.size() > list1.size()) {
            maxList = list2;
            minList = list1;
        }
        for (String string : maxList) {
            map.put(string, 1);
        }
        for (String string : minList) {
            Integer value = map.get(string);
            if (value != null) {
                map.put(string, 0);
                continue;
            }
            map.put(string, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                diff.add(entry.getKey());
            }
        }
        return diff;
    }
}
