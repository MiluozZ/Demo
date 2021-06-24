package miluo.Lambda;

import java.util.function.Consumer;

/**
 * @className: ConsumerFunction
 * @description:  java.util.function包下的Consumer接口，接收一个参数，无返回值
 *                方法：Consumer.accept()
 * @author: Miluo
 * @date: 2021/1/19
 **/
public class ConsumerFunction {
    private static Consumer<String> consumer(){
        return x ->{
            System.out.println(x);
        };
    }

    private static void consumer1(Consumer<String> action){
        action.accept("Consumer测试2");
    }

    public static void main(String[] args) {
        Consumer c = consumer();
        c.accept("Consumer测试1");

        consumer1((x) ->{
            System.out.println(x);
        });
    }
}
