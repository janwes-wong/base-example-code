package com.stream.liststream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.liststream
 * @date 2021/5/20 22:22
 * @description
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张有忌");
        list.add("张忌");
        list.add("李国荣");
        list.add("长孙无忌");
        traditionalFilter(list);
        streamFilter(list);
    }

    /**
     * 传统方式对集合中的进行数据过滤
     *
     * @param list
     */
    public static void traditionalFilter(List<String> list) {
        // 对list集合中的元素进行筛选，以"张"开头的元素，并存储到一个新的集合中
        List<String> eleListA = new ArrayList<>();
        for (String ele : list) {
            if (ele.startsWith("张")) {
                eleListA.add(ele);
            }
        }
        System.out.println(eleListA);

        // 对list集合中的元素进行筛选，以姓名长度为3的元素，并存储到一个新的集合中
        List<String> eleListB = new ArrayList<>();
        for (String ele : list) {
            if (ele.length() == 3) {
                eleListB.add(ele);
            }
        }
        System.out.println(eleListB);
    }

    /**
     * stream流的方式
     *
     * @param list
     */
    public static void streamFilter(List<String> list) {
        // 过滤以"张"开头的元素
        list.stream().filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));

        list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
        // 过滤以"张"开头的元素的个数
        long count = list.stream().filter(name -> name.startsWith("张")).count();
        System.out.println("以\"张\"开头的元素的个数:" + count);

        // 过滤以"张"开头的元素，并收集到list集合中
        List<String> collList = list.stream().filter(name -> name.startsWith("张")).collect(Collectors.toList());
        System.out.println(collList);
    }
}
