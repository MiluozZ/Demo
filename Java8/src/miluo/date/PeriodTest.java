package miluo.date;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author Miluo
 * @className PeriodTest
 * @description 时间段：用年月日表示，因此只接收LocalDate
 * @date 2021/4/25
 **/
public class PeriodTest {
    public static void main(String[] args) {
        //初始化
        Period period = Period.of(2, 3, 6);
        Period period1 = Period.between(
                LocalDate.of(2021, 1, 5),
                LocalDate.of(2021, 4, 5)
        );

    }
}
