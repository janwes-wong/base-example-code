package com.janwes.localDateTime;

import java.time.LocalDateTime;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.localDateTime
 * @date 2022/1/13 14:13
 * @description
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("相加多少天，日期往后推:" + localDateTime.plusDays(10));
        System.out.println("相减多少天，日期往前推:" + localDateTime.minusDays(10));
        System.out.println("当前日期[年月日]:" + localDateTime);
        System.out.println("年:" + localDateTime.getYear());
        System.out.println("月(英文): " + localDateTime.getMonth());
        System.out.println("月(数字): " + localDateTime.getMonthValue());
        System.out.println("星期(英文): " + localDateTime.getDayOfWeek());
        System.out.println("星期(数字): " + localDateTime.getDayOfWeek().getValue());

        LocalDateTime of = LocalDateTime.of(2022, 5, 5, 20, 0, 5);
        System.out.println(of);
        LocalDateTime l2 = of.plusHours(24);
        System.out.println(l2);
        // 加10分钟
        LocalDateTime l1 = of.plusMinutes(10);
        System.out.println(l1);
    }
}
