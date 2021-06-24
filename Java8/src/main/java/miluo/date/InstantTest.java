package miluo.date;

import java.time.Instant;

/**
 * @author Miluo
 * @className InstantTest
 * @description 时间戳:可精确到纳秒
 * @date 2021/4/25
 **/
public class InstantTest {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);//2021-04-25T08:54:31.094Z
    }
}
