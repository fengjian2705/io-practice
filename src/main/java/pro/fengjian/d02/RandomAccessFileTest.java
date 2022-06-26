package pro.fengjian.d02;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) {
        RandomAccessFile raf = null;

        try {
            // 1. 创建 RandomAccessFile 类型的对象与文件关联
            raf = new RandomAccessFile("/Users/fengjian/study/temp/b.txt", "rw");
            // 2. 对文件内容进行随机读写操作
            // 设置距离文件开头位置的偏移量，从开头位置向后偏移 3 个字节 aellhello
            raf.seek(4);
            int res = raf.read();
            System.out.println("读取到的单个字符是: " + (char) res);
            res = raf.read();
            System.out.println("读取到的单个字符是: " + (char) res);
            raf.write('2');// 执行该代码后，覆盖了字符'e'
            System.out.println("写入数据成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流对象并释放有关的资源
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
