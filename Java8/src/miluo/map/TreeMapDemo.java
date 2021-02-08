package miluo.map;

import java.util.TreeMap;

/**
 * @className: TreeMapDemo
 * @description: TreeMap可以将key值进行排序
 * @author: Miluo
 * @date: 2021/2/7
 **/
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>((x,y) -> y-x);  //从大到小排序
        treeMap.put(3,"333");
        treeMap.put(2,"222");
        treeMap.put(4,"444");
        treeMap.put(1,"111");

        treeMap.forEach((key,value) -> System.out.println("key->" + key + "  " + "value->" +value));
//        key->4  value->444
//        key->3  value->333
//        key->2  value->222
//        key->1  value->111
    }
}
