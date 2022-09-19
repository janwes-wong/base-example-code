package com.socket;

import java.util.Arrays;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0
 * @package com.socket
 * @date 2021/4/29 23:22
 * @description
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("jack");
        Student s2 = new Student("jack");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s1 == s2);
        boolean b = s1.equals(s2);
        System.out.println(b);
        System.out.println(s1.getName() == s2.getName());

        String images = "http://192.168.1.10/a1.jpg,http://192.168.1.10/a2.jpg,http://192.168.1.10/a3.jpg,http://192.168.1.10/a4.jpg";
        String[] split = images.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        List<String> list = Arrays.asList(split);
        System.out.println(list);
    }
}
