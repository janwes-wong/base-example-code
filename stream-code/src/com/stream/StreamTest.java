package com.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2022/1/11 13:57
 * @description
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> resources = new ArrayList<>();
        resources.add("市级目标");
        resources.add("区级目标");
        //resources.add("部门目标");
        resources.add("街道目标");

        List<String> actualList = new ArrayList<>();
        actualList.add("市级目标");
        actualList.add("区级目标");
        actualList.add("部门目标");
        //actualList.add("街道目标");


        System.out.println(getDiffElement(resources, actualList));
        System.out.println(getDifferent(resources,actualList));
    }

    private static List<String> getDiffElement(List<String> resources, List<String> dest) {
        List<String> results = new ArrayList<>();
        if (resources.size() > dest.size()) {
            for (String resource : resources) {
                if (dest.contains(resource)) {
                    results.add(resource);
                }
            }
        }
        if (resources.size() < dest.size()) {
            for (String s : dest) {
                if (resources.contains(s)) {
                    results.add(s);
                }
            }
        }
        return results;
    }

    private static List<String> getDifferent(List<String> list1, List<String> list2) {
        long st = System.currentTimeMillis();
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
            Integer cc = map.get(string);
            if (cc != null) {
                map.put(string, ++cc);
                continue;
            }
            map.put(string, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                diff.add(entry.getKey());
            }
        }
        System.out.println("getDifferent total times " + (System.currentTimeMillis() - st));
        return diff;
    }
}
