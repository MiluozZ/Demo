package miluo.exception;

/**
 * @className: ExceptionDemo2
 * @description: 自定义异常构造器，
 * @author: Miluo
 * @date: 2021/2/8
 **/
class MyException2 extends Exception{
    public MyException2(){};
    public MyException2(String msg){
        super(msg);
    }
}

public class ExceptionDemo2 {
    public void test() throws MyException2{
        System.out.println("自定义异常");
        throw new MyException2("创建字符串参数构造器");
    }

    public static void main(String[] args) {
        ExceptionDemo2 demo2 = new ExceptionDemo2();
        try {
            demo2.test();
        } catch (MyException2 myException2) {
            myException2.printStackTrace();
        }
    }
/*    自定义异常
    miluo.exception.MyException2: 创建字符串参数构造器
    at miluo.exception.ExceptionDemo2.test(ExceptionDemo2.java:19)
    at miluo.exception.ExceptionDemo2.main(ExceptionDemo2.java:25)*/
}
