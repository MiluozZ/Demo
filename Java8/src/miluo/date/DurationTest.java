package miluo.date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Miluo
 * @className Duration
 * @description 时间段
 * @date 2021/4/25
 **/
public class DurationTest {
    public static void main(String[] args) {
        LocalDateTime from = LocalDateTime.of(2021, Month.JANUARY, 5, 10, 7, 0);    // 2017-01-05 10:07:00
        LocalDateTime to = LocalDateTime.of(2021, Month.FEBRUARY, 5, 10, 7, 0);     // 2017-02-05 10:07:00
        Duration duration = Duration.between(from, to);     // 表示从 2017-01-05 10:07:00 到 2017-02-05 10:07:00 这段时间

        long days = duration.toDays();              // 这段时间的总天数
        long hours = duration.toHours();            // 这段时间的小时数
        long minutes = duration.toMinutes();        // 这段时间的分钟数
        long seconds = duration.getSeconds();       // 这段时间的秒数
        long milliSeconds = duration.toMillis();    // 这段时间的毫秒数
        long nanoSeconds = duration.toNanos();      // 这段时间的纳秒数
    }
}
