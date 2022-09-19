package com.example;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @author Janwes
 * @version 1.0
 * @package com.example
 * @date 2021/8/11 10:35
 * @description
 */
public class Example {
    public static void main(String[] args) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MINUTE, 0);
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(calendar.getTime());
        System.out.println(time);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        math();
    }

    public static void math() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("before " + list);
        call(list);
        System.out.println("after " + list);
    }

    public static void call(List<String> list) {
        list.add("D");
    }
}
