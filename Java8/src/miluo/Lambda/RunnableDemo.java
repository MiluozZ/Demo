package miluo.Lambda;

/**
 * @className: Demo1
 * @description: 测试Runnable接口
 * @author: Miluo
 **/
class method{
    public static void out(){
        System.out.println("方法引用测试");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        //java1.8之前
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("测试");
            }
        }
        ).start();

        //Lambda表达式
        new Thread(
                () ->{
                    System.out.println("Lambda测试");
                }
        ).start();


        //方法引用
        new Thread(method::out).start();
    }
}

