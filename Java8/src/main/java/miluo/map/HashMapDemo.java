package miluo.map;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @className: HashMap
 * @description:
 * @author: Miluo
 * @date: 2021/2/7
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3,"333");
        map.put(1,"111");
        map.put(2,"222");
        Iterator iterator = map.keySet().iterator();


        while (iterator.hasNext()){
            Integer key = (Integer) iterator.next();
            System.out.println("key->" + key + "   " + "value->" + map.get(key) );
            if (key == 1){
//                map.remove(key);
//                hashMap不是线程安全的，无法在迭代器中修改原Map，否则会引发运行时异常ConcurrentModificationException
                iterator.remove();
            }
        }
        System.out.println("*****************************");
        map.forEach((key,value) -> System.out.println("key->" + key + "  " + "value->" +value));



    }
}
