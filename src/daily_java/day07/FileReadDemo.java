package daily_java.day07;

import java.io.*;

/**
 * @ClassName FileReadDemo
 * @Description TODO
 * @Author QIAN-feng
 * @Date 2020/10/26
 **/
public class FileReadDemo {
    public static void main(String[] args) throws IOException {
        //创建一个文件夹File对象,注意需要显示抛出异常（IOException是编译时异常）
        //可以用try catch捕获，也可以在方法签名处使用throws抛出
        File inputfile = new File("D:\\java-daily\\picture\\sun.jpg");
        //创建一个字节输入流，此处有上转型对象
        InputStream is = new FileInputStream(inputfile);
        //准备和文件大小一致ide字节数组
        byte[] b = new byte[(int) inputfile.length()];
        //通过字节输入流将文件读入数组
        is.read(b);
        //准备输出文件对象
        File outputfile = new File("D:\\java-daily\\picture\\sun1.jpg");
        //准备输出流
        OutputStream os = new FileOutputStream(outputfile);
        os.write(b);
        is.close();
        os.close();





    }

}

