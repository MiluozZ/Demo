package miluo.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Collect
 * @description: Collect对Stream里的值进行集合操作
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Collect {
    public static void main(String[] args) {
        //tolist:将Stream流中的值转为list集合
        List<String> collect = Stream.of("a", "b", "c").collect(Collectors.toList());
        collect.forEach(System.out::println);

        //joining：将Stream流中的值用joining()中的值拼接为一个字符串
        String collect1 = Stream.of("a", "b", "c").collect(Collectors.joining());
        System.out.println(collect1);   //abc
        String collect2 = Stream.of("a", "b", "c").collect(Collectors.joining(","));
        System.out.println(collect2);   //a,b,c
    }
}
