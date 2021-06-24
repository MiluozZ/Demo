package miluo.stream;

import java.util.stream.Stream;

/**
 * @className: Iterate
 * @description: iterate()对数据进行迭代处理
 * @author: Miluo
 * @date: 2021/1/21
 **/
public class Iterate {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x + 1) //param1为初始值，param2为迭代操作过程，每次结果为下一次迭代的被操作值
                .limit(3)
                .forEach(System.out::print); //012


    }
}
