package pro.fengjian.d02;

import java.io.*;

/**
 * <h1>缓冲区字节流拷贝文件</h1>
 *
 * @author 风间
 * @since 2022/6/26
 */
public class BufferedByteCopyTest {

    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // 1. 创建 BufferedInputStream 类型的对象与/Users/fengjian/study/temp/io流体系.jpg文件关联
            bis = new BufferedInputStream(new FileInputStream("/Users/fengjian/study/temp/io流体系.jpg"));
            // 2. 创建 BufferedOutputStream 类型的对象与/Users/fengjian/study/temp/io流体系02.jpg文件关联
            bos = new BufferedOutputStream(new FileOutputStream("/Users/fengjian/study/temp/io流体系02.jpg"));
            // 3. 不断的从输入流中读取数据并写入到输出流中
            System.out.println("正在玩命的拷贝...");

//            byte[] bArr = new byte[1024];
//            int res = 0;
//            while ((res = bis.read(bArr)) != -1) {
//                bos.write(bArr, 0, res);
//            }
            int res = 0;
            while ((res = bis.read()) != -1) {
                bos.write(res);
            }

            System.out.println("拷贝文件成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象并释放相关资源
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
