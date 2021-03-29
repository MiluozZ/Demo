package miluo.test;

import java.util.Arrays;
import java.util.List;

/**
 * @className: Test
 * @description: 测试使用
 * @author: Miluo
 * @date: 2021/1/25
 **/
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1");
        Long[] arr = new Long[]{2L,3L,4L,5L};
        Arrays.stream(arr).forEach( x -> sb.append(",").append(String.valueOf(x)));
        System.out.println(sb);
    }

    private static Integer addList(List<Integer> list){
        return list.parallelStream().mapToInt(i -> i)
                .sum();
    }
}
