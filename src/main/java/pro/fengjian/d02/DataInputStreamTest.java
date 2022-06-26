package pro.fengjian.d02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
            // 1. 创建 DataInputStream 类型的对象与文件关联
            dis = new DataInputStream(new FileInputStream("/Users/fengjian/study/temp/a.txt"));
            // 2. 从输入流中读取一个整数并打印
            int res = dis.readInt(); // 读取四个字节
//            int read = dis.read(); // 读取一个字节
            System.out.println("读取的整数数据是: " + res);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流并释放相关的资源
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
