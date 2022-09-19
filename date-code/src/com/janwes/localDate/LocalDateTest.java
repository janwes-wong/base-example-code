package com.janwes.localDate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.localDate
 * @date 2021/12/30 10:43
 * @description
 */
public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("当前日期[年月日]:" + localDate);
        System.out.println("当前日期[年月日]:" + localDate.format(DateTimeFormatter.ISO_DATE));
        System.out.println("转换成年、一年中的第几周、星期几:" + localDate.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println("转换成年、一年中的第几天:" + localDate.format(DateTimeFormatter.ISO_ORDINAL_DATE));
        //System.out.println("当前日期[年月日]:" + localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println("年: " + localDate.getYear());
        System.out.println("月(英文): " + localDate.getMonth());
        System.out.println("月(数字): " + localDate.getMonthValue());
        System.out.println("今天一年中的第几天(数字): " + localDate.get(ChronoField.DAY_OF_YEAR));
        System.out.println("今天一年中的第几天(数字): " + localDate.get(ChronoField.DAY_OF_WEEK));
        System.out.println("星期(英文): " + localDate.getDayOfWeek());
        System.out.println("星期(数字): " + localDate.getDayOfWeek().getValue());
        final LocalDate of = LocalDate.of(2022, 5, 1);
        System.out.println(of);
    }
}
