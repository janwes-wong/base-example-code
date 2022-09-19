package com.stream.listsort_03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.listsort_03
 * @date 2021/5/19 17:26
 * @description
 */
public class StreamSortTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("jack", "male", 20));
        list.add(new Student("judy", "female", 12));
        list.add(new Student("lucy", "female", 9));
        list.add(new Student("alex", "male", 33));
        System.out.println("排序前：>>>" + list);
        List<Student> studentList = list.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).collect(Collectors.toList());
        System.out.println("排序后：>>>" + studentList);
    }
}
