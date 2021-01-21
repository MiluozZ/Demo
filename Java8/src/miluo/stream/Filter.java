package miluo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @className: Filter
 * @description: filter();  //对集合进行迭代过滤
 *               distinct(); //去除重复数据
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Filter {
    public static void main(String[] args) {
        //从数组中找出比5大的数值
        int[] arr = {1,9,8,2,7,3,6,4,5,10};
        Arrays.stream(arr)
                .filter((int x) -> x > 5)
                .forEach(System.out::println);


        //从数组中找出首位为数字的值
        String[] arr1 = {"abc","1abc","dsq","2dfw","fds","3dsa"};
        List<String> collect = Arrays.stream(arr1)
                .filter(str -> isDigital(str.charAt(0)))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


    private static Boolean isDigital(char c){
        return c >= '0' && c <= '9';
    }
}
