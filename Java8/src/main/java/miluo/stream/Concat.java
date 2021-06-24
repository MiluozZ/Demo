package miluo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Miluo
 * @className Concat
 * @description concat拼接两个stream流
 * @date 2021/4/25
 **/
public class Concat {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9);
        Stream<Integer> concat = Stream.concat(list1.stream(), list2.stream());
        List<Integer> list3 = concat.collect(Collectors.toList());
        System.out.println(list3);//[1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
