package miluo.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @className: Peak
 * @description: 可对Stream流操作进行查看调试
 * @author: Miluo
 * @date: 2021/1/25
 **/
public class Peak {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = integers.stream().mapToInt( i -> i)
                .peek(j -> System.out.println("peak: " + j))
                .sum();
        System.out.println(sum);
        //        输出：
        //        peak: 1
        //        peak: 2
        //        peak: 3
        //        peak: 4
        //        peak: 5
        //        15
    }
}
