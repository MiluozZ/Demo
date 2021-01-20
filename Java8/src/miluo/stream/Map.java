package miluo.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Map
 * @description: Map可以将一种类型的值转换成另一种类型
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Map {
    public static void main(String[] args) {
        //将小写字符串数组转换为大写字符串的链表
        List<String> collect = Stream.of("a", "b", "hello", "world").map(String::toUpperCase).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
