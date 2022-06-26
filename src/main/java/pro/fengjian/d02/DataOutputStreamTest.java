package pro.fengjian.d02;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

    public static void main(String[] args) {
        DataOutputStream dos = null;

        try {
            // 1. 创建 DataOutputStream 类型的对象与 /Users/fengjian/study/temp/a.txt 文件关联
            dos = new DataOutputStream(new FileOutputStream("/Users/fengjian/study/temp/a.txt"));
            // 2. 准备一个整数数据 66 写入输出流
            // 66: 0000 0000 ... 0100 0010 =>   B
            int num = 66;
            dos.writeInt(num);
            System.out.println("写入数据成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流对象并释放有关的资源
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
