package pro.fengjian.d02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;

        try {
            // 1. 创建 ObjectOutputStream 类型的对象与文件关联
            oos = new ObjectOutputStream(new FileOutputStream("/Users/fengjian/study/temp/a.txt"));
            // 2. 准备一个 User 类型的对象并初始化
            User user = new User("jack", "123456", "18888888888");
            // 3. 将整个 User 类型的对象写入输出流
            oos.writeObject(user);
            System.out.println("写入对象成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象并释放有关的资源
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
