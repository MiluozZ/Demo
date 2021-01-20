package miluo.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @className: Max
 * @description: Max找到Stream流中最大的值，需要传入Comparator对象用作比较器,会返回一个Optional对象。
 *               如果Stream为空，那么Optional也为空，如果Stream存在，Optional也存在，用.get()方法获取值。
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class MaxOrMin {
    public static void main(String[] args) {
        Integer i = Stream.of(9, 1, 2, 8, 7, 3, 4, 6, 5).max(Comparator.comparing(x -> x)).get();
        System.out.println(i);

    }
}
