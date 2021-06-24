package miluo.exception;

/**
 * @className: ExceptionDemo4
 * @description: try...catch...finally,确保无论try里面发生了什么，都会执行finally的语句，对于内存来说，
 *               java有内存回收机制，但是对于需要清理的资源，比如网络连接，文件的打开关闭来说，都需要恢复
 *               初始状态
 * @author: Miluo
 * @date: 2021/2/8
 **/
class Switch{
    private static Boolean status = false;
    void on(){
        status = true;
        System.out.println(this);
    }

    void off(){
        status = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return status?"on":"off";
    }
}
public class ExceptionDemo4 {
    static void ex() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        try {
            aSwitch.on();
            ex();
            aSwitch.off();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            aSwitch.off();
        }
    }
/*    输出：
    on
    java.lang.Exception
    at miluo.exception.ExceptionDemo4.ex(ExceptionDemo4.java:30)
    at miluo.exception.ExceptionDemo4.main(ExceptionDemo4.java:37)
    off*/
}
