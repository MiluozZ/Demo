package miluo.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Collect
 * @description: Collect对Stream里的值进行最终操作
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Collect {
    public static void main(String[] args) {
        //Collectors.tolist:将Stream流中的值转为list集合
        List<String> collect = Stream.of("a", "b").collect(Collectors.toList());
        collect.forEach(System.out::println);

        //Collectors.joining：将Stream流中的值用joining()中的值拼接为一个字符串
        String collect1 = Stream.of("a", "b", "c").collect(Collectors.joining());
        System.out.println(collect1);   //abc
        String collect2 = Stream.of("a", "b", "c").collect(Collectors.joining(",","[","]"));//(分隔符，前缀，后缀)
        System.out.println(collect2);   //[a,b,c]

        //Collectors.toCollection:定制自己所需的集合
        TreeSet<String> collect3 = collect.stream().collect(Collectors.toCollection(TreeSet::new));
        collect3.forEach(System.out::print);  //ab

        //Collectors.maxBy(最大值)/minBy(最小值): 将集合转换为值
        String s = Stream.of("a", "abc", "ab", "abcd")
                            .collect(Collectors.maxBy(Comparator.comparing(x -> x.chars().count())))
                            .get();
        System.out.println(s);  //abcd

        //Collectors.partitioningBy:数据分块，分为true和false两个部分
        Map<Boolean, List<Integer>> collect4 = Stream.of(1, 2, 3, 4, 5, 6)
                                                    .collect(Collectors.partitioningBy(x -> x < 4));
        collect4.forEach( (x,y) -> System.out.println(x + " -> " + y));
                                    //        输出：false -> [4, 5, 6]
                                    //              true -> [1, 2, 3]

        //Collectors.groupingBy ：数据分组
        Map<Character, List<String>> collect5 = Stream.of("a1", "a2", "b1", "b2", "c1", "c2")
                                                .collect(Collectors.groupingBy(x -> x.charAt(0)));
        collect5.forEach( (x,y) -> System.out.println(x + " -> " + y));
                                    //        输出：a -> [a1, a2]
                                    //              b -> [b1, b2]
                                    //              c -> [c1, c2]

        Map<Character, List<Character>> collect6 = Stream.of("a1", "a2", "b1", "b2", "c1", "c2")
                //第二个参数为子收集器，对主收集器的结果在进行操作，形成最终结果
                .collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.mapping(x -> x.charAt(1), Collectors.toList())));
        collect6.forEach( (x,y) -> System.out.println(x + " -> " + y));
                                    //        输出:a -> [1, 2]
                                    //             b -> [1, 2]
                                    //             c -> [1, 2]
    }
}
