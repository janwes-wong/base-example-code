package com.stream.listsort_02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.listsort_02
 * @date 2021/5/19 16:28
 * @description
 */
public class StudentSortTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("jack", "male", 20));
        list.add(new Student("judy", "female", 12));
        list.add(new Student("lucy", "female", 9));
        list.add(new Student("alex", "male", 33));
        System.out.println("排序前：" + list);
        Collections.sort(list);
        System.out.println("排序后：" + list);
    }
}
