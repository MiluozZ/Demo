package miluo.util;

import java.util.StringJoiner;

/**
 * @className: StringJoiner
 * @description: StringJoiner可以自动拼接,在固定格式下，比StringBuilder更方便
 * @author: Miluo
 * @date: 2021/4/6
 **/
public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        for (int i = 0; i < 10; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);//0,1,2,3,4,5,6,7,8,9

        //有前缀后缀
        StringJoiner stringJoiner1 = new StringJoiner(".", "[", "]");
        for (int i = 0; i < 10; i++) {
            stringJoiner1.add(String.valueOf(i));
        }
        System.out.println(stringJoiner1);//[0.1.2.3.4.5.6.7.8.9]

        //合并
        stringJoiner.merge(stringJoiner1);
        System.out.println(stringJoiner);//0,1,2,3,4,5,6,7,8,9,0.1.2.3.4.5.6.7.8.9

        //长度:包括前后缀
        System.out.println(stringJoiner1.length()); //21
    }
}
