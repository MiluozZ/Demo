package miluo.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author Miluo
 * @className LocalDate
 * @description 日期
 * @date 2021/4/25
 **/
public class LocalDateTest {
    public static void main(String[] args) {
        //初始化
        LocalDate localDate = LocalDate.of(2021, 4, 25);//2021-04-25
        LocalDate localDate1 = LocalDate.now();//2021-04-25
        LocalDate parse = LocalDate.parse("2021-04-25");//2021-04-25

        //年
        int year = localDate.getYear();
        System.out.println(year);//2021
        int dayOfYear = localDate.getDayOfYear();
        System.out.println(dayOfYear);//115

        //月
        Month month = localDate.getMonth();
        System.out.println(month);//APRIL
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println(dayOfMonth);//25

        //星期
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);//SUNDAY

        //格式
        String format = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(format);//20210425

    }
}
