package miluo.Lambda;

import java.util.function.Supplier;

/**
 * @className: SupplierFunction
 * @description: java.util.function包下的Supplier接口，没有入参，有一个返回值
 *               方法：Supplier.get()
 * @author: Miluo
 * @date: 2021/1/20
 **/
public class SupplierFunction {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Supplier测试";
        System.out.println(supplier.get());
    }
}
