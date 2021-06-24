package miluo.optional;

import java.util.Optional;

/**
 * @author Miluo
 * @className CheckOptional
 * @description 1.isPresent();
 *
 * @date 2021/4/12
 **/
public class CheckOptional {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> test = Optional.of("test");

        //Boolean isPresent()；判断Optional对象是否为空
        System.out.println(empty.isPresent());//false
        System.out.println(test.isPresent());//true

        //如果有值存在，则执行Lambda表达式
        test.ifPresent(s -> System.out.println(s.length()));//4

    }
}
