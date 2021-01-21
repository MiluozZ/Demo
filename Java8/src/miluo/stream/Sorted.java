package miluo.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @className: Sorted
 * @description: Sorted可对Stream流进行值排序
 * @author: Miluo
 * @date: 2021/1/21
 **/
public class Sorted {
    public static void main(String[] args) {
        Stream.of(9,8,7,6,5,4,3,2,1)
                .sorted((x , y) -> x -y)
                .forEach(System.out::print); //123456789
    }
}
