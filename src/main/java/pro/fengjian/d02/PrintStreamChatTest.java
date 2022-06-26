package pro.fengjian.d02;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <h1>字节打印流</h1>
 *
 * @author 风间
 * @since 2022/6/26
 */
public class PrintStreamChatTest {

    public static void main(String[] args) {

        // 由手册可知： 构造方法需要的是 Reader 类型的引用，但 Reade 类是个抽象类，实参只能传递字子类的对象 字符流
        // 由手册可知： System.in 代表键盘输入，而且是 InputStream 类型的 字节流
        BufferedReader br = null;
        PrintStream ps = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(new FileOutputStream("/Users/fengjian/study/temp/a.txt"));

            // 声明一个 boolean 类型变量作为发送方代表
            boolean flag = true;

            while (true) {
                // 1. 提示用户输入要发送的聊天内容并使用变量记录
                System.out.println("请" + (flag ? "张三" : "李四") + "输入要发送的聊天内容: ");
                String str = br.readLine();
                // 2. 判断用户输入的是否是"bye"，若是则聊天结束
                if ("bye".equals(str)) {
                    System.out.println("聊天结束 !");
                    break;
                }
                // 3. 若不是则将用户输入内容写入到文件 /Users/fengjian/study/temp/a.txt 中
//                else {
                // 获取当前系统时间，并调整格式
                Date d1 = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println(sdf.format(d1) + (flag ? " 张三说: " : " 李四说: ") + str);
                ps.println(sdf.format(d1) + (flag ? " 张三说: " : " 李四说: ") + str);
//                }
                flag = !flag;
                ps.println();// 换行
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭流对象并释放相关的资源
            if (ps != null) {
                ps.close();
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
