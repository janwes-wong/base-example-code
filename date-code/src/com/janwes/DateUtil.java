package com.janwes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes
 * @date 2022/6/11 20:44
 * @description 日期操作工具类
 */
public class DateUtil {

    /**
     * 将Date转换成LocalDate
     *
     * @param date
     * @return
     */
    public static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     * 将Date转换成LocalDateTime
     *
     * @param date
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * 将Date转换成ZonedDateTime
     *
     * @param date
     * @return
     */
    public static ZonedDateTime dateToZonedDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault());
    }

    /**
     * LocalDate转换为Date
     *
     * @param localDate
     * @return
     */
    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * LocalDateTime转换为Date
     *
     * @param localDateTime
     * @return
     */
    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * ZonedDateTime
     *
     * @param zonedDateTime
     * @return
     */
    public static Date toDate(ZonedDateTime zonedDateTime) {
        return Date.from(zonedDateTime.toInstant());
    }

    /**
     * 日期格式化
     *
     * @param date
     * @param pattern 模式："yyyy-MM-dd HH:mm:ss" or "yyyy-MM-dd" or "yyyy/MM/dd" or "yyyy年MM月dd日" or "yyyyMMdd" 等等
     * @return
     */
    public static String dateFormat(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 字符串日期解析为Date
     * <p>
     * For example, pattern "yyyy-MM-dd HH:mm:ss" would result in "2022-05-05 20:00:00"
     * </p>
     *
     * @param strDate 字符串日期 "20220501 20:00:00" or "20220501" or "2022-05-01 20:00:00" 等等
     * @param pattern 模式："yyyy-MM-dd HH:mm:ss" or "yyyy-MM-dd" or "yyyy/MM/dd" or "yyyy年MM月dd日" or "yyyyMMdd" 等等
     * @return
     */
    public static Date strDateParseDate(String strDate, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format("parse strDate %s failure, maybe %s and %s is don't match", strDate, strDate, pattern));
        }
    }

    /**
     * 在Date添加了指定的天数，时间往后推移.
     * <p>
     * For example, 2008-12-31 plus one day would result in 2009-01-01.
     * </p>
     *
     * @param date
     * @param offsetDay 偏差天数
     * @return Date
     */
    public static Date plusDays(Date date, long offsetDay) {
        final LocalDate localDate = DateUtil.dateToLocalDate(date);
        final LocalDate plusLocalDate = localDate.plusDays(offsetDay);
        return DateUtil.toDate(plusLocalDate);
    }

    /**
     * 在LocalDate添加了指定的天数，时间往后推移.
     * <p>
     * For example, 2008-12-31 plus one day would result in 2009-01-01.
     * </p>
     *
     * @param localDate
     * @param offsetDay 偏差天数
     * @return Date
     */
    public static LocalDate plusDays(LocalDate localDate, long offsetDay) {
        return localDate.plusDays(offsetDay);
    }

    /**
     * 在LocalDateTime添加了指定的天数，时间往后推移.
     * <p>
     * For example, 2008-12-31 plus one day would result in 2009-01-01.
     * </p>
     *
     * @param localDateTime
     * @param offsetDay     偏差天数
     * @return Date
     */
    public static LocalDateTime plusDays(LocalDateTime localDateTime, long offsetDay) {
        return localDateTime.plusDays(offsetDay);
    }

    /**
     * 在LocalDate减去了指定的天数，时间往前推移.
     * <p>
     * For example, 2009-01-01 minus one day would result in 2008-12-31.
     * </p>
     *
     * @param localDate
     * @param offsetDay 偏差天数
     * @return LocalDate
     */
    public static LocalDate minusDays(LocalDate localDate, long offsetDay) {
        return localDate.minusDays(offsetDay);
    }

    /**
     * 在LocalDate减去了指定的天数，时间往前推移.
     * <p>
     * For example, 2009-01-01 minus one day would result in 2008-12-31.
     * </p>
     *
     * @param localDateTime
     * @param offsetDay     偏差天数
     * @return LocalDate
     */
    public static LocalDateTime minusDays(LocalDateTime localDateTime, long offsetDay) {
        return localDateTime.minusDays(offsetDay);
    }

    /**
     * 在Date减去了指定的天数，时间往前推移.
     * <p>
     * For example, 2009-01-01 minus one day would result in 2008-12-31.
     * </p>
     *
     * @param date
     * @param offsetDay 偏差天数
     * @return Date
     */
    public static Date minusDays(Date date, long offsetDay) {
        final LocalDate localDate = DateUtil.dateToLocalDate(date);
        final LocalDate minusLocalDate = localDate.minusDays(offsetDay);
        return DateUtil.toDate(minusLocalDate);
    }

    /**
     * 在Date添加了指定的月数，时间往后推移.
     * <p>
     * For example, 2007-03-31 plus one month would result in the invalid date 2007-04-31
     * </p>
     *
     * @param date
     * @param offsetMonths 偏差月数
     * @return Date
     */
    public static Date plusMonths(Date date, long offsetMonths) {
        final LocalDate localDate = DateUtil.dateToLocalDate(date);
        final LocalDate plusLocalDate = localDate.plusMonths(offsetMonths);
        return DateUtil.toDate(plusLocalDate);
    }

    /**
     * 在LocalDate添加了指定的月数，时间往后推移.
     * <p>
     * For example, 2007-03-31 plus one month would result in the invalid date 2007-04-31
     * </p>
     *
     * @param localDate
     * @param offsetMonths 偏差月数
     * @return Date
     */
    public static LocalDate plusMonths(LocalDate localDate, long offsetMonths) {
        return localDate.plusMonths(offsetMonths);
    }

    /**
     * 在LocalDateTime添加了指定的月数，时间往后推移.
     * <p>
     * For example, 2007-03-31 plus one month would result in the invalid date 2007-04-31
     * </p>
     *
     * @param localDateTime
     * @param offsetMonths  偏差月数 相差天数
     * @return Date
     */
    public static LocalDateTime plusMonths(LocalDateTime localDateTime, long offsetMonths) {
        return localDateTime.plusMonths(offsetMonths);
    }

    /**
     * 在Date减去了指定的月数，时间往前推移.
     * <p>
     * For example, 2008-12-31 plus one day would result in 2008-11-31.
     * </p>
     *
     * @param date
     * @param offsetMonths 偏差月数
     * @return Date
     */
    public static Date minusMonths(Date date, long offsetMonths) {
        final LocalDate localDate = DateUtil.dateToLocalDate(date);
        final LocalDate plusLocalDate = localDate.minusMonths(offsetMonths);
        return DateUtil.toDate(plusLocalDate);
    }

    /**
     * 在LocalDate减去了指定的月数，时间往前推移.
     * <p>
     * For example, 2008-12-31 plus one day would result in 2008-11-31.
     * </p>
     *
     * @param localDate
     * @param offsetMonths 偏差月数
     * @return LocalDate
     */
    public static LocalDate minusMonths(LocalDate localDate, long offsetMonths) {
        return localDate.minusMonths(offsetMonths);
    }

    /**
     * 在LocalDateTime减去了指定的月数，时间往前推移.
     * <p>
     * For example, 2008-12-31 plus one day would result in 2008-11-31.
     * </p>
     *
     * @param localDateTime
     * @param offsetMonths  偏差月数 相差天数
     * @return Date
     */
    public static LocalDateTime minusMonths(LocalDateTime localDateTime, long offsetMonths) {
        return localDateTime.minusMonths(offsetMonths);
    }

    /**
     * 两个时间相差的时数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static long diffHours(Date startDate, Date endDate) {
        // Date转成LocalDate
        LocalDateTime startLocalDateTime = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime endLocalDateTime = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        // 计算相差时数
        return ChronoUnit.HOURS.between(startLocalDateTime, endLocalDateTime);
    }

    /**
     * 两个时间相差的月数
     *
     * @param startLocalDateTime
     * @param endLocalDateTime
     * @return
     */
    public static long diffHours(LocalDateTime startLocalDateTime, LocalDateTime endLocalDateTime) {
        // 计算相差时数
        return ChronoUnit.HOURS.between(startLocalDateTime, endLocalDateTime);
    }

    /**
     * 两个时间相差的天数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static long diffDays(Date startDate, Date endDate) {
        // Date转成LocalDate
        LocalDate startLocalDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endLocalDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // Math.abs(startLocalDate.toEpochDay() - endLocalDate.toEpochDay()); // 转换成绝对值(不出现负数)
        //return startLocalDate.toEpochDay() - endLocalDate.toEpochDay();
        // 计算相差天数
        return ChronoUnit.DAYS.between(startLocalDate, endLocalDate);
    }

    /**
     * 两个时间相差的天数
     *
     * @param startLocalDate
     * @param endLocalDate
     * @return
     */
    public static long diffDays(LocalDate startLocalDate, LocalDate endLocalDate) {
        // 计算相差天数
        return ChronoUnit.DAYS.between(startLocalDate, endLocalDate);
    }

    /**
     * 两个时间相差的天数
     *
     * @param startLocalDateTime
     * @param endLocalDateTime
     * @return
     */
    public static long diffDays(LocalDateTime startLocalDateTime, LocalDateTime endLocalDateTime) {
        // 两种方式计算相差天数，精确至时分秒计算，与LocalDate有实质性的区别，LocalDate忽略时分秒的差异
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        return duration.toDays();
        // 计算相差天数
        //return ChronoUnit.DAYS.between(startLocalDateTime, endLocalDateTime);
    }

    /**
     * 两个时间相差的月数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static long diffMonths(Date startDate, Date endDate) {
        // Date转成LocalDate
        LocalDate startLocalDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endLocalDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // 计算相差月数
        return ChronoUnit.MONTHS.between(startLocalDate, endLocalDate);
    }

    /**
     * 两个时间相差的月数
     *
     * @param startLocalDate
     * @param endLocalDate
     * @return
     */
    public static long diffMonths(LocalDate startLocalDate, LocalDate endLocalDate) {
        // 计算相差月数
        return ChronoUnit.MONTHS.between(startLocalDate, endLocalDate);
    }

    /**
     * 两个时间相差的月数
     *
     * @param startLocalDateTime
     * @param endLocalDateTime
     * @return
     */
    public static long diffMonths(LocalDateTime startLocalDateTime, LocalDateTime endLocalDateTime) {
        // 计算相差月数
        return ChronoUnit.MONTHS.between(startLocalDateTime, endLocalDateTime);
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
            if (dayWeek == 1) {
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

    /**
     * 获取当前日期所在周的所有日期
     *
     * @param currentDate
     * @return
     */
    public static List<Date> getCurrentWeek(Date currentDate) {
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

    /**
     * 获取当前日期的下周几日期
     *
     * @param currentDate
     * @param dayOfWeek
     * @return
     */
    public static Date getNextWeekDate(Date currentDate, int dayOfWeek) {
        if (dayOfWeek <= 0 || dayOfWeek > 7) {
            throw new IllegalStateException(String.format("day of week [%s] is illegal value.", dayOfWeek));
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);

        // 获得当前日期是一个星期的第几天 按照西方习惯认为周日为一星期中的第一天，为了按中国的习惯一个星期的第一天是星期一，故减1
        int dayWeek = cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 7 : cal.get(Calendar.DAY_OF_WEEK) - 1;
        cal.add(Calendar.DATE, (7 - dayWeek) + dayOfWeek);
        return cal.getTime();
    }
}
