package miluo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: FlatMap
 * @description: FlatMap可将值替换为Stream，可将多个Stream值合并为一个Stream。
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class FlatMap {
    public static void main(String[] args) {
        //FlatMap将两个Stream合并为一个Stream
        List<String> collect = Stream.of(Arrays.asList("a,b,c"), Arrays.asList("d,e,f"))
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        //输出为：a,b,c
        //       d,e,f

/*        map是两个Stream转为两个新的Stream
        List<Stream<String>> collect1 = Stream.of(Arrays.asList("a,b,c"), Arrays.asList("d,e,f")).map(list -> list.stream()).collect(Collectors.toList());
        collect1.forEach(System.out::println);
        输出为：java.util.stream.ReferencePipeline$Head@2d98a335
               java.util.stream.ReferencePipeline$Head@16b98e56*/
    }
}
