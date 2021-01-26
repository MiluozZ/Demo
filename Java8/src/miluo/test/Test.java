package miluo.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @className: Test
 * @description: 测试使用
 * @author: Miluo
 * @date: 2021/1/25
 **/
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Integer integer = addList(list);
        System.out.println(integer);
    }

    private static Integer addList(List<Integer> list){
        return list.parallelStream().mapToInt(i -> i)
                .sum();
    }
}
