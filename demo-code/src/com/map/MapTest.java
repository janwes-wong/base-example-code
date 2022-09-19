package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Janwes
 * @version 1.0
 * @package com.map
 * @date 2021/5/19 17:43
 * @description Map集合遍历
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("jack", 20);
        map.put("lucy", 25);
        map.put("alex", 14);
        map.put("judy", 28);
        map.put("helen", 35);

        System.out.println("通过Map.entrySet遍历key和value");
        // 1. 通过Map.entrySet遍历key和value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key：" + entry.getKey() + " -- " + "value：" + entry.getValue());
        }

        System.out.println("通过Map.entrySet使用iterator遍历key和value");
        // 2. 通过Map.entrySet使用iterator遍历key和value
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("key：" + entry.getKey() + " -- " + "value：" + entry.getValue());
        }

        System.out.println("通过Map.keySet使用iterator遍历key和value");
        // 3. 通过Map.keySet使用iterator遍历key和value
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("获取key对应的值value：" + value);
        }

        System.out.println("通过Map.KeySet遍历key和value");
        // 4. 通过Map.keySet遍历key和value
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("获取key对应的值value：" + value);
        }

        // 通过Map.values()遍历value,无法遍历key
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // 通过Map.keySet()遍历key,无法遍历value
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 使用lambda表达式
        map.forEach((key, value) -> System.out.println("key：" + key + " -- " + "value：" + value));
    }
}
