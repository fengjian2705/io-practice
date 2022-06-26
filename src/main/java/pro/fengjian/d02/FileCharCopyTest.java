package pro.fengjian.d02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * <h1>文本文件拷贝</h1>
 *
 * @author 风间
 * @since 2022/6/26
 */
public class FileCharCopyTest {

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            // 1. 创建 FileReader 类型的对象与/Users/fengjian/study/temp/a.txt文件关联
            fr = new FileReader("/Users/fengjian/study/temp/a.txt");
            // 2. 创建 FileWriter 类型的对象与/Users/fengjian/study/temp/b.txt文件关联
            fw = new FileWriter("/Users/fengjian/study/temp/b.txt");
            // 3. 不断的从输入流中读取数据内容并写入到输出流中
            int res = 0;
            System.out.println("正在玩命的拷贝");
            while ((res = fr.read()) != -1) {
                fw.write(res);
            }
            System.out.println("拷贝文件成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象并释放有关的资源
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
