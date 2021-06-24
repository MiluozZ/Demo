package miluo.util;

import org.springframework.util.StopWatch;

import java.util.stream.IntStream;

/**
 * @author Miluo
 * @className StopWatchTest
 * @description
 * 优点：
 * 1.spring自带工具类，可直接使用
 * 2.代码实现简单，使用更简单
 * 3.统一归纳，展示每项任务耗时与占用总时间的百分比，展示结果直观
 * 4.性能消耗相对较小，并且最大程度的保证了start与stop之间的时间记录的准确性
 * 5.可在start时直接指定任务名字，从而更加直观的显示记录结果
 *
 * 缺点：
 * 1.一个StopWatch实例一次只能开启一个task，不能同时start多个task，并且在该task未stop之前不能start一个新的task
 *  ，必须在该task stop之后才能开启新的task，若要一次开启多个，需要new不同的StopWatch实例
 * 2.代码侵入式使用，需要改动多处代码
 * @date 2021/6/9
 **/
public class StopWatchTest {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("test1");
        test1();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
//        StopWatch '': running time = 101946700 ns
//                ---------------------------------------------
//                ns         %     Task name
//                ---------------------------------------------
//                101946700  100%  test1

    }

    private static void test1(){
        int x = IntStream.rangeClosed(1, 10000).sum();
    }
}
