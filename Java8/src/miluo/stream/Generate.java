package miluo.stream;

import java.util.stream.Stream;

/**
 * @className: Generate
 * @description: generate生成流，入参为Supplier接口
 * @author: Miluo
 * @date: 2021/1/21
 **/
public class Generate {
    public static void main(String[] args) {
        Stream.generate(() -> "generate测试")
                .limit(3) //limit进行数量约束，如不约束会一直生成
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5).peek(System.out::println).map(i -> i + "1").forEach(System.out::println);
    }
}
