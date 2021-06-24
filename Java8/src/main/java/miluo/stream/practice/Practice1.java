package miluo.stream.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @className: Practice1
 * @description: Java8函数式编程习题
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Practice1 {
    public static void main(String[] args) {
        //1
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum(Arrays.stream(arr)));  //45

        //2
        System.out.println(lowCaseCount("Hello World"));  //8

        //3
        System.out.println(mostLowerCase(new LinkedList<>(Arrays.asList("a","BBb","DDdD","Ccc"))));

    }

    //1.编写一个函数，求出流中所有数之和。
    private static int sum(Stream<Integer> num){
        return num.reduce(0,Integer::sum);
    }

    //2.计算一个字符串中小写字母的个数
    //chars()为String所实现的CharSequence接口中的方法 : public default IntStream chars()
    private static int lowCaseCount(String str){
        return (int)str.chars().filter(Character::isLowerCase).count();
    }

    //3.在一个字符串列表中，找出包含最多小写字母的字符串，对于空列表，返回Optional<String>对象
    private static Optional<String> mostLowerCase(List<String> list){
        return list.stream().max(Comparator.comparing(Practice1::lowCaseCount));
    }

    //进阶： 4.只用reduce和Lambda表达式写出实现Stream上的map操作的代码，如果不想返回Stream，可以返回一个List。
    //map可将一种类型转换为其他类型,reduce在一组值当中聚合为一个值
    //参考答案及解释： https://segmentfault.com/q/1010000004944450
    private static Stream likeMap(Stream stream){
        return null;
    }






}
