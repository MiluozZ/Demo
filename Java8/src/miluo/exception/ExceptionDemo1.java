package miluo.exception;

/**
 * @className: ExceptionDemo1
 * @description:  自定义最简单的异常，继承Exception
 * @author: Miluo
 * @date: 2021/2/8
 **/
class MyException1 extends Exception{
}

public class ExceptionDemo1 {
    public static void test() throws MyException1{
        System.out.println("exception from test");
        throw new MyException1();
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (MyException1 myException1) {
            System.out.println("checked it");
            myException1.printStackTrace();
        }
    }
/*    exception from test
    checked it
    miluo.exception.MyException1
    at miluo.exception.ExceptionDemo1.test(ExceptionDemo1.java:15)
    at miluo.exception.ExceptionDemo1.main(ExceptionDemo1.java:20)*/
}
