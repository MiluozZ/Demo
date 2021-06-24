package miluo.stream.practice;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Practice4
 * @description: 找出名字最长的艺术家，分别使用收集器和reduce高阶函数实现，对比二者的异同
 * @author: Miluo
 * @date: 2021/1/22
 **/
public class Practice4 {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("John Lennon", "Paul Mccartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        System.out.println(longestMax(nameStream));   //Stuart Sutcliffe

        //一个程序中，一个Stream流只能被操作一次，重复使用会报错；
        Stream<String> nameStream2 = Stream.of("John Lennon", "Paul Mccartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        System.out.println(longestReduce(nameStream2));     //Stuart Sutcliffe

        Stream<String> nameStream3 = Stream.of("John Lennon", "Paul Mccartney", "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
        System.out.println(longestCollector(nameStream3));      //Stuart Sutcliffe
    }

    private static String longestMax(Stream<String> stream){
        return stream.max(Comparator.comparing( x -> x.chars().count())).get();
    }

    private static String longestReduce(Stream<String> stream){
        return stream.reduce((x , y) -> x.chars().count() < y.chars().count() ? y : x).get();
    }

    private static String longestCollector(Stream<String> stream){
        return stream.collect(Collectors.maxBy(Comparator.comparing( x -> x.chars().count() ))).get();
    }
}
