package com.janwes;

import java.util.*;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/7/22 15:41
 * @description 哈希冲突示例
 */
public class HashConflictTest {

    public static void main(String[] args) {
        hashConflictList();
        Map<String, Integer> hashMap = new HashMap<>();
        /*hashMap.put("b", 1111);
        hashMap.put("c", 1111);
        hashMap.put("d", 1111);
        hashMap.put("e", 1111);
        hashMap.put("f", 1111);
        hashMap.put("g", 1111);
        hashMap.put("h", 1111);
        hashMap.put("I", 1111);
        hashMap.put("j", 1111);
        hashMap.put("k", 1111);
        hashMap.put("l", 1111);
        hashMap.put("m", 1111);
        hashMap.put("n", 1111); // 第一次扩容

        hashMap.put("o", 1111);
        hashMap.put("p", 1111);
        hashMap.put("P", 1111);
        hashMap.put("r", 1111);
        hashMap.put("s", 1111);
        hashMap.put("t", 1111);
        hashMap.put("u", 1111);
        hashMap.put("v", 1111);
        hashMap.put("w", 1111);
        hashMap.put("x", 1111);
        hashMap.put("y", 1111);
        hashMap.put("z", 1111); // 第二次扩容*/

        // 添加hash code相同的key
        hashMap.put("!", 1);
        hashMap.put("1", 2);
        hashMap.put("A", 3);
        hashMap.put("Q", 4);
        hashMap.put("a", 5);
        hashMap.put("q", 6);
        hashMap.put("i", 7);
        hashMap.put("±", 8);
        hashMap.put("Á", 9);
        hashMap.put("Ñ", 10);
        hashMap.put("á", 11);
        hashMap.put("ñ", 12);
        hashMap.put("ā", 13);
        hashMap.put("đ", 14);
        hashMap.put("ġ", 15);
        hashMap.put("ı", 16);
        hashMap.put("Ł", 17);
        hashMap.put("ő", 18);
        System.out.println(hashMap);
    }

    private static void hashConflictList() {
        Map<Integer, List<String>> param = new HashMap<>();
        for (int i = 33; i < 250; i++) {
            char ch = (char) i;
            String str = String.valueOf(ch);
            int index = 15 & str.hashCode();
            List<String> list = param.get(index);
            if (list == null) {
                list = new ArrayList<>();
            }
            list.add(str);
            param.put(index, list);
        }
        param.forEach((k, v) -> System.out.println(k + " " + Arrays.toString(v.toArray())));
    }
}
