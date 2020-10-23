package daily_java.day04;

/**
 * @ClassName MyClassTest
 * @Description TODO
 * @Author QIAN-feng
 * @Date 2020/10/23
 **/
public class MyClassTest {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        obj.methodStatic();
        MyClass.methodStatic();
        myMethod();
        MyClassTest.myMethod();
    }

    public static void myMethod() {
        System.out.println("自己的方法！");
    }
}
