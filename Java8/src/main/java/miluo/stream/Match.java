package miluo.stream;

import java.util.stream.Stream;

/**
 * @className: Match
 * @description: match对Stream流中的数据进行判断，返回boolean值
 * @author: Miluo
 * @date: 2021/1/21
 **/
public class Match {
    public static void main(String[] args) {
        //allMatch : 所有数据判断为true则返回true
        boolean a = Stream.of(1, 2, 3, 4, 5).allMatch(x -> x == 3);
        System.out.println(a); //false

        //anyMatch : 至少有一个数据判断为true则返回true
        boolean b = Stream.of(1, 2, 3, 4, 5).anyMatch(x -> x == 3);
        System.out.println(b); //true

        //allMatch : 所有数据判断为false则返回true
        boolean c = Stream.of(1, 2, 3, 4, 5).noneMatch(x -> x == 3);
        System.out.println(c); //false
    }
}
