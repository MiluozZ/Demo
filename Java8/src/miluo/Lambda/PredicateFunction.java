package miluo.Lambda;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @className: PredicateFunction
 * @description:  java.util.function包下的Predicate接口，接收一个参数类型，返回Boolean类型
 *                方法：Predicate.test()
 * @author: Miluo
 * @date: 2021/1/19
 **/
public class PredicateFunction {
    private static Predicate<Integer> predicate(){
        return x ->{
            return x < 5;
        };
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = predicate();
        if (predicate.test(3)){
            System.out.println("Predicate测试1");
        }

        //Stream流
        Stream.of(3,5,6,4,2,1,7,8,9).filter(predicate).forEach(System.out::println);
    }
}
