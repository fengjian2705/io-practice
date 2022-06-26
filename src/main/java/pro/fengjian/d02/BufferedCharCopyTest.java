package pro.fengjian.d02;

import java.io.*;

public class BufferedCharCopyTest {

    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // 1. 创建 BufferedReader 类型的对象与 /Users/fengjian/study/temp/a.txt 文件关联
            br = new BufferedReader(new FileReader("/Users/fengjian/study/temp/a.txt"));
            // 2. 创建 BufferedWriter 类型的对象与 /Users/fengjian/study/temp/b.txt 文件关联
            bw = new BufferedWriter(new FileWriter("/Users/fengjian/study/temp/b.txt"));
            // 3. 不断的从输入流中读取一行字符串并写入到输出流中
            System.out.println("正在玩命的拷贝...");
            String str = null;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            System.out.println("拷贝文件成功 !");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象并释放有关的资源
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
