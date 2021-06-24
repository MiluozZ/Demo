package miluo.Lambda;

import java.util.function.Function;

/**
 * @className: FunctionFunction
 * @description: java.util.function包下的Function接口，接收一个参数类型，返回另一个参数类型
 *               方法：Function.apply()
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class FunctionFunction {
    private static Function<Integer,String> function(){
        return x -> "Function测试1";
    }

    public static void main(String[] args) {
        Function function = function();
        System.out.println(function.apply(1));
    }
}
