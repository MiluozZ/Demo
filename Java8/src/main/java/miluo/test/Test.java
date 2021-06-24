package miluo.test;

import java.util.List;

/**
 * @className: Test
 * @description: 测试使用
 * @author: Miluo
 * @date: 2021/1/25
 **/
public class Test {
    public static void main(String[] args) {
        String  str = "D99|赔款|";
        String[] split = str.split("\\|");
        System.out.println(split[1]);
//        String  str = "D99,赔款,";
//        String[] split = str.split(",");
//        System.out.println(split[1]);
    }

    private static Integer addList(List<Integer> list){
        return list.parallelStream().mapToInt(i -> i)
                .sum();
    }
}
