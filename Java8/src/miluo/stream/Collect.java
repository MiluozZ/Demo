package miluo.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Collect
 * @description: Collect对Stream里的值进行操作
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Collect {
    public static void main(String[] args) {
        List<String> collect = Stream.of("a", "b", "c").collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
