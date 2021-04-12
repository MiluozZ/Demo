package miluo.optional;

import java.util.Optional;

/**
 * @className OptionalTest
 * @description 1.Optional.empty();
 *              2.Optional.of();
 *              3.Optional.ofNullable()
 * @author Miluo
 * @date 2021/4/12
 **/
public class CreateOptional {
    //如果对象为空，请避免与Option.empty()返回的实例的{==}比较
    //因为不能保证它是一个单例，反之，应该使用isPresent()
    private static Optional method1(){
        return Optional.empty();
    }

    //返回特定的非空值Optional
    private static Optional method2(String test){
        return Optional.of(test);
    }

    //静态方法需要一个非 null 参数:否则,将引发空指针异常
    //因此，如果我们不知道参数是否为 null ，那就是我们使用 ofNullable 的时候
    //如果参数为null，则生产一个空的Optional对象
    private static Optional method3(String test){
        return Optional.ofNullable(test);
    }

    public static void main(String[] args) {
        //method1
        System.out.println(method1());//Optional.empty
        System.out.println(method1().isPresent());//false

        //method2
        System.out.println(method2(null));
        System.out.println(method2(null).isPresent());
/*        Exception in thread "main" java.lang.NullPointerException
        at java.util.Objects.requireNonNull(Objects.java:203)
        at java.util.Optional.<init>(Optional.java:96)
        at java.util.Optional.of(Optional.java:108)
        at miluo.optional.CreateOptional.method2(CreateOptional.java:40)
        at miluo.optional.CreateOptional.main(CreateOptional.java:18)*/

        System.out.println(method2("test"));//Optional[test]
        System.out.println(method2("test").isPresent());//true


        //method3
        System.out.println(method3(null));//Optional.empty
        System.out.println(method3(null).isPresent());//false

        System.out.println(method3("test"));//Optional[test]
        System.out.println(method3("test").isPresent());//true
    }

}
