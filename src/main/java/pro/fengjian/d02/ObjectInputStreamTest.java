package pro.fengjian.d02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * <h1>对象输入流</h1>
 *
 * @author 风间
 * @since 2022/6/26
 */
public class ObjectInputStreamTest {

    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
            // 1. 创建 ObjectInputStream 类型的对象与文件关联
            ois = new ObjectInputStream(new FileInputStream("/Users/fengjian/study/temp/a.txt"));
            // 2. 从输入流中读取一个对象并打印
            Object obj = ois.readObject();
            System.out.println("读取到的对象是: " + obj);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                // 3. 关闭流对象并释放有关的资源
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
