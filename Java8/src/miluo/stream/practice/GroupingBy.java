package miluo.stream.practice;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

/**
 * @className: Practice6
 * @description: 用定制的收集器实现Collectors.groupingBy方法，不需要提供下游收集器，只需要一个最简单的即可。
 * @author: Miluo
 * @date: 2021/1/22
 **/
public class GroupingBy <T,K> implements Collector<T,Map<K,List<T>>,Map<K,List<T>>>{
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a1", "a2", "b1", "b2");
        GroupingBy<String, String> groupingBy = new GroupingBy<>(x -> String.valueOf(x.toString().charAt(0)));
        Map<String, List<String>> collect = stream.collect(groupingBy);
        collect.forEach((k,v) -> System.out.println(k + "->" + v));
                            //        输出：a->[a1, a2]
                            //              b->[b1, b2]
    }



    //数据流按照function的结果进行分组
    private final Function< ? super T,? extends K> function;

    public GroupingBy(Function function) {
        this.function = function;
    }

    //提供初始容器
    @Override
    public Supplier<Map<K, List<T>>> supplier() {
        return HashMap::new;
    }


    //将初始容器与Stream中的每个元素进行计算
    @Override
    public BiConsumer<Map<K, List<T>>, T> accumulator() {
        return (map,element) -> {
            K key = function.apply(element);
            if (!map.containsKey(key)){
                map.put(key, new LinkedList<>(Arrays.asList(element)));
            }else{
                map.get(key).add(element);
            }
        } ;

//        return (map, element) -> {
//            K key = function.apply(element);
//            List<T> elements = map.computeIfAbsent(key, k -> new ArrayList<>());
//            elements.add(element);
//        };
    }


    //此方法用于并发Stream中
    @Override
    public BinaryOperator<Map<K, List<T>>> combiner() {
//        return (x,y) -> {
////            x.forEach((k,v) -> {
////                y.merge(k,v,(right,left) -> {
////                    right.addAll(left);
////                    return right;
////                });
////            });
////            return y;
////        };
        return null;


//        return (left, right) -> {
//            right.forEach((key, value) -> {
//                left.merge(key, value, (leftValue, rightValue) -> {
//                    leftValue.addAll(rightValue);
//                    return leftValue;
//                });
//            });
//            return left;
//        };
    }


    //将初始容器值转换为最终结果
    @Override
    public Function<Map<K, List<T>>, Map<K, List<T>>> finisher() {
        return map -> map;
    }

    private final static Set<Characteristics> characteristics = new HashSet<>();
    static {
        characteristics.add(Characteristics.IDENTITY_FINISH);
    }

    //characteristics: 这个方法返回该Collector具有的哪些特征，返回的是一个Set,
    // 分别是CONCURRENT(并发), UNORDERED(未排序)，IDENTITY_FINISH(finisher方法直接返回初始容器)等特征的组合。
    @Override
    public Set<Characteristics> characteristics() {
        return characteristics;
    }
}
