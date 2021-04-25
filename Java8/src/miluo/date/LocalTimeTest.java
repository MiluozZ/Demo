package miluo.date;

import java.time.LocalTime;

/**
 * @author Miluo
 * @className LocalTimeTest
 * @description 时间，与LocalDate相似
 * @date 2021/4/25
 **/
public class LocalTimeTest {
    public static void main(String[] args) {
        //初始化
        LocalTime now = LocalTime.now();
        LocalTime parse = LocalTime.parse("16:46:32");
        LocalTime of = LocalTime.of(16, 46, 32);

        //时
        int hour = now.getHour();
        //分
        int minute = now.getMinute();
        //秒
        int second = now.getSecond();
    }
}
