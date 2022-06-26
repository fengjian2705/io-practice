package pro.fengjian.d02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * <h1>文件字节流拷贝</h1>
 *
 * @author 风间
 * @since 2022/6/26
 */
public class FileByteCopyTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 1. 创建 FileInputStream 类型的对象与/Users/fengjian/study/temp/io流体系.jpg
            fis = new FileInputStream("/Users/fengjian/study/temp/io流体系.jpg");
            // 2. 创建 FileOutputStream 类型的对象与/Users/fengjian/study/temp/io流体系02.jpg
            fos = new FileOutputStream("/Users/fengjian/study/temp/io流体系02.jpg");
            // 3. 不断的从输入流中读取数据内容并写入到输出流中
            System.out.println("正在玩命的拷贝...");
            int res = 0;
            while ((res = fis.read()) != -1) {
                fos.write(res);
            }
            System.out.println("拷贝文件成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流对象并释放有关的资源
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
