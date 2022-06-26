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

            /*int res = 0;
            while ((res = fr.read()) != -1) {
                System.out.println("读取到的单个字符是: " + (char) res);
            }*/

            // 准备一个字符数组来保存读取到的数据内容
            char[] cArr = new char[5];
            // 期望读取字符数组的部分空间
//            int res = fr.read(cArr, 1, 3);
//            System.out.println("实际读取到的字符个数是: " + res);// 3
//            for (char cv : cArr) {
//                System.out.println("读取到的单个字符是: " + (char) cv);// 啥也没有 a e l 啥也没有
//            }
            // 期望读取整个字符数组
            int res = fr.read(cArr);
            System.out.println("实际读取到的字符个数是: " + res);// 5
            for (char cv : cArr) {
                System.out.println("读取到的单个字符是: " + (char) cv);// a e l l h
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
