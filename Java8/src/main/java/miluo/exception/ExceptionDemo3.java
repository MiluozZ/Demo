package miluo.exception;

/**
 * @className: ExceptionDemo3
 * @description: 自定义异常：自定义参数，自定义信息格式内容
 * @author: Miluo
 * @date: 2021/2/8
 **/
class MyException3 extends Exception{
    private int num;
    MyException3(){}

    MyException3(String msg){
        super(msg);
    }
    MyException3(String msg,Integer num){
        super(msg);
        this.num = num;
    }

    @Override
    public String getMessage() {
        return "自定义异常： msg：" + super.getMessage() + "  num:" + num;
    }
}
public class ExceptionDemo3 {
    public void test1() throws MyException3 {
        System.out.println("this exception from test1()");
        throw new MyException3();
    }

    public void test2() throws MyException3{
        System.out.println("this exception from test2()");
        throw new MyException3("from test2()");
    }

    public void test3() throws MyException3{
        System.out.println("this exception from test3()");
        throw new MyException3("from test3()",233);
    }

    public static void main(String[] args) {
        ExceptionDemo3 demo3 = new ExceptionDemo3();
        try {
            demo3.test1();
        } catch (MyException3 myException3) {
            myException3.printStackTrace();
        }

        try {
            demo3.test2();
        } catch (MyException3 myException3) {
            myException3.printStackTrace();
        }

        try {
            demo3.test3();
        } catch (MyException3 myException3) {
            myException3.printStackTrace();
        }
    }

/*输出：
            this exception from test1()
    miluo.exception.MyException3: 自定义异常： msg：null  num:0
    at miluo.exception.ExceptionDemo3.test1(ExceptionDemo3.java:29)
    at miluo.exception.ExceptionDemo3.main(ExceptionDemo3.java:45)
            this exception from test2()
    miluo.exception.MyException3: 自定义异常： msg：from test2()  num:0
    at miluo.exception.ExceptionDemo3.test2(ExceptionDemo3.java:34)
    at miluo.exception.ExceptionDemo3.main(ExceptionDemo3.java:51)
            this exception from test3()
    miluo.exception.MyException3: 自定义异常： msg：from test3()  num:233
    at miluo.exception.ExceptionDemo3.test3(ExceptionDemo3.java:39)
    at miluo.exception.ExceptionDemo3.main(ExceptionDemo3.java:57)*/

}
