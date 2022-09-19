package com.janwes.date;

import com.janwes.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.janwes.date
 * @date 2022/6/11 20:45
 * @description
 */
public class DateTest {
    public static void main(String[] args) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final String format = dateFormat.format(new Date());
        System.out.println(format);

        try {
            final Date date = dateFormat.parse("2022-06-05 20:00:00");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(dateToLocalDate(new Date()));

        final ZonedDateTime zonedDateTime = DateUtil.dateToZonedDateTime(new Date());
        System.out.println(zonedDateTime);

        System.out.println(DateUtil.dateFormat(new Date(), "yyyy年MM月dd日"));
        System.out.println(DateUtil.dateFormat(new Date(), "yyyyMMdd"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
        try {
            final Date date = simpleDateFormat.parse("202205");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(DateUtil.strDateParseDate("2022-5", "yyyy-MM"));

        System.out.println(DateUtil.plusDays(new Date(), 10));
        System.out.println(DateUtil.diffDays(
                DateUtil.strDateParseDate("2022-06-01 20:00:00", "yyyy-MM-dd HH:mm:ss"), new Date()));

        LocalDateTime l1 = LocalDateTime.of(2022, 6, 1, 14, 20, 25);
        System.out.println(DateUtil.diffDays(l1, LocalDateTime.now()));

        System.out.println(
                DateUtil.diffMonths(DateUtil.strDateParseDate("2022-05-016 20:00:00", "yyyy-MM-dd HH:mm:ss"), new Date()));

        System.out.println(
                DateUtil.diffMonths(LocalDate.of(2022, 5, 11), LocalDate.now()));

        System.out.println(
                DateUtil.diffMonths(LocalDateTime.of(2022, 5, 12, 11, 5, 10), LocalDateTime.now()));

        System.out.println(
                DateUtil.diffHours(DateUtil.strDateParseDate("2022-6-12 13:40:00", "yyyy-MM-dd HH:mm:ss"), new Date()));

        System.out.println(getMonths("20001201", "20220601"));
    }

    /**
     * 将Date转换成LocalDate
     *
     * @param date
     * @return
     */
    private static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static List<String> getMonths(String startDate, String endDate) {
        try {
            List<String> months = new ArrayList<>();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
            Date date1 = simpleDateFormat.parse(startDate);
            Date date2 = simpleDateFormat.parse(endDate);

            Calendar c1 = Calendar.getInstance();
            c1.setTime(date1);
            int year = c1.get(Calendar.YEAR);
            int month = c1.get(Calendar.MONTH);
            c1.set(year, month, 1, 0, 0, 0);

            Calendar c2 = Calendar.getInstance();
            c2.setTime(date2);
            int weekYear = c2.get(Calendar.YEAR);
            int weekOfYear = c2.get(Calendar.WEEK_OF_YEAR);
            c2.setWeekDate(weekYear, weekOfYear, Calendar.SUNDAY);
            while (true) {
                int tempMonth = c1.get(Calendar.MONTH);
                String date = c1.getWeekYear() + "" + ((tempMonth + 1) <= 9 ? "0" + (tempMonth + 1) : tempMonth + 1);
                months.add(date);

                c1.set(Calendar.MONTH, tempMonth + 1);
                if (c1.getTimeInMillis() >= c2.getTimeInMillis()) {
                    break;
                }
            }
            return months;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
