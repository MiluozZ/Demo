package miluo.stream.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @className: Practice1
 * @description:
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Practice1 {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum(Arrays.stream(arr)));


    }

    //1.编写一个函数，求出流中所有数之和。
    private static int sum(Stream<Integer> num){
        return num.reduce(0,Integer::sum);
    }





}
