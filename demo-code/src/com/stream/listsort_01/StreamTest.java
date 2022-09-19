package com.stream.listsort_01;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2021/5/19 15:46
 * @description
 */
public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("jack", "male", 20));
        list.add(new Student("judy", "female", 12));
        list.add(new Student("lucy", "female", 9));
        list.add(new Student("alex", "male", 33));

        System.out.println("排序前：" + list);
        // 比较器实现排序
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("排序后：" + list);
    }
}
