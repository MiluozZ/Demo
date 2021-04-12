package miluo.optional;

import java.util.Optional;

/**
 * @author Miluo
 * @className ValueOptional
 * @description get(),orElse(),orElseGet()
 * @date 2021/4/12
 **/
public class ValueOptional {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        Optional<String> test = Optional.of("test");

        //T get():获取Optional对象内的值
        System.out.println(test.get()); //test
            //如果Optional对象为null,get()会报错
            //System.out.println(empty.get());
            //Exception in thread "main" java.util.NoSuchElementException: No value present


        //T orElse(T)
        System.out.println(empty.orElse(print("empty orElse")));
            //empty orElse方法执行
            //empty orElse
        System.out.println(test.orElse(print("test orElse")));
            //test orElse方法执行
            //test


        //T orElseGet(Supplier<? extends T> other)
        System.out.println(empty.orElseGet(() -> print("empty orElseGet")));
            //empty orElseGet方法执行
            //empty orElseGet
        System.out.println(test.orElseGet(() -> print("test orElseGet")));
            //test

        //orElse()和orElseGet()的区别：
        //无论Optional是否有值，且不管orElse()中的方法是否有需要都会执行，
        //orElseGet()只有Optional对象为null时才执行
        //默认情况下，每次使用orElseGet()更为有意义，除非默认对象已经构造并可以直接访问
    }
    private static String print(String str){
        System.out.println(str+"方法执行");
        return str;
    }
}
