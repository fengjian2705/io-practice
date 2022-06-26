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
            // 方式一：以单个字节为单位进行拷贝，也就是每次读取一个字节后再写入一个字节
            // 缺点：文件稍大时，拷贝的效率很低
//            int res = 0;
//            while ((res = fis.read()) != -1) {
//                fos.write(res);
//            }
            // 方式二：准备一个和文件大小一样的缓冲区，一次性将文件中的所有内容取出到缓冲区，然后一次性写进去
            // 缺点：若文件过大时，无法申请和文件大小一样的缓冲区，真实物理内存不足
//            int len = fis.available();
//            System.out.println("获取到的文件大小是: "+ len);
//            byte[] bArr = new byte[len];
//            int res = fis.read(bArr);
//            System.out.println("实际读取到的文件大小是:  "+ res);
//            fos.write(bArr);
            // 方式三：准备一个相对适当的缓冲区，分多次将文件拷贝完成
            byte[] bArr = new byte[1024];
            int res = 0;
            while ((res = fis.read(bArr)) != -1) {
                fos.write(bArr, 0, res);
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
