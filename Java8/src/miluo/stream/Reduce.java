package miluo.stream;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

/**
 * @className: Reduce
 * @description: Reduce是通用模式，可以在一组值当中生产一个值，count(),min(),max()都属于reduce
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class Reduce {
    public static void main(String[] args) {
        int[] arr = {9,1,2,8,7,3,4,6,5};

        //数组求和
        //reduce第一个入参0为初始条件,同时也是第二个入参中的x的初始值，返回 x + y 则为下一次操作的x
        int reduce = Arrays.stream(arr).reduce(0, (x, y) -> x + y);
        System.out.println(reduce); //45


        //转为min()
        int min = Arrays.stream(arr).reduce(arr[0], (x, y) -> x < y ? x : y);
        System.out.println(min);  //1

        //转为count()
        int count = Arrays.stream(arr).reduce( 0, (x, y) -> x+1);
        System.out.println(count);  //9
    }
}
