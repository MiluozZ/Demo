package miluo.Lambda;

import java.util.*;

/**
 * @className: Demo2
 * @description: Collections.sort() 定制 Comparator
 * @author: Miluo
 **/
public class ComparatorDemo {
    public static void main(String[] args) {
        //原方法
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(3);
        linkedList.add(1);
        linkedList.add(2);
        Collections.sort(linkedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//为正数交换，为负数不交换（o1在前则为升序，o2在前则为降序）
            }
        });
        for (Integer i : linkedList){
            System.out.println(i);
        }


        //Lambda表达式
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(4);
        arrayList.add(5);
        Collections.sort(arrayList,(x,y) ->  x - y);
        arrayList.forEach(x ->{
            System.out.println(x);
        });
        //方法引用：arrayList.forEach(System.out::println);
    }
}