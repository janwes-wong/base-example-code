package com.janwes.date;

import com.janwes.DateUtil;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.date
 * @date 2023/6/13 16:00
 * @description
 */
public class WeekDateTest {
    public static void main(String[] args) throws ParseException {
        System.out.println(getWeek(1, new Date()));
        System.out.println(dateToCurrentWeek(new Date()));

        System.out.println(DateUtil.getWeekDate(new Date(), 0, 7));
    }

    /**
     * 获取当前周的所有日期
     *
     * @param n           -1代表上一周,1代表下一周
     * @param currentDate 当前日期
     * @return
     */
    private static List<Date> getWeek(int n, Date currentDate) {
        List<Date> date = new ArrayList<>();
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            Calendar cal = Calendar.getInstance();
            cal.setTime(currentDate);
            // 判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周了
            int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天
            if (1 == dayWeek) {
                cal.add(Calendar.DAY_OF_MONTH, -1);
            }
            // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
            cal.setFirstDayOfWeek(Calendar.MONDAY);
            // 获得当前日期是一个星期的第几天
            int day = cal.get(Calendar.DAY_OF_WEEK);
            // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
            cal.add(Calendar.DATE, (cal.getFirstDayOfWeek() - day + 7 * n));
            date.add(cal.getTime());
            for (int i = 1; i < 7; i++) {
                cal.add(Calendar.DATE, 1);
                date.add(cal.getTime());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return date;
    }

    public static List<Date> dateToCurrentWeek(Date currentDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);

        // 获得当前日期是一个星期的第几天 按照西方习惯认为周日为一星期中的第一天，为了按中国的习惯一个星期的第一天是星期一，故减1
        int b = cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 7 : cal.get(Calendar.DAY_OF_WEEK) - 1;
        Date date;
        List<Date> dates = new ArrayList<>();
        long timestamp = currentDate.getTime() - b * 24 * 3600000L;
        for (int a = 1; a <= 7; a++) {
            date = new Date();
            date.setTime(timestamp + (a * 24 * 3600000));
            dates.add(a - 1, date);
        }
        return dates;
    }
}
