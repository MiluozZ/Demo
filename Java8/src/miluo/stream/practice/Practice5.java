package miluo.stream.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Practice5
 * @description: 假设一个元素为单词的流，计算每个单词出现的次数。
 *               假设输入如下：返回[john->3,Paul->2,George->1]的map
 * @author: Miluo
 * @date: 2021/1/22
 **/
public class Practice5 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");

        Map<String, Long> collect = names.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        collect.forEach((k,v) -> System.out.println(k + "->" + v));
                    //        输出：George->1
                    //              John->3
                    //              Paul->2



    }
}
