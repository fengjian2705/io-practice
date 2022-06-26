package pro.fengjian.d02;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        FileReader fr = null;
        try {
            // 1. 构造 FileReader 类型的对象与/Users/fengjian/study/temp/a.txt 文件关联
            fr = new FileReader("/Users/fengjian/study/temp/a.txt");
            // 2. 读取数据内容并打印
            /*int res = fr.read();
            System.out.println("读取到的单个字符是: " + (char) res);// 'a'*/

            int res = 0;
            while ((res = fr.read()) != -1) {
                System.out.println("读取到的单个字符是: " + (char) res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 关闭流对象并释放有关的资源
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
