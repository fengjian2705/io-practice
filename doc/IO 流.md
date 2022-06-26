# IO 流

>概念

* IO 流就是指读写数据时像流水一样从一端流到另一端，引测得名为"流"

> 基本分类

* 按照读写数据的基本单位不同：分为**字节流**和**字符流**
    * 字节流主要指以字节为单位进行数据读写的流，可以读写任务类型的文件
    * 字符流主要指以字符（2个字节）为单位进行数据读写的流，只能读写文本文件
  
* 按照读写数据的方向不同，分为**输入流**和**输出流**（站在程序的角度）
    * 输入流主要指从文件中读取数据内容输入到程序中，也就是读文件
    * 输出流主要指将程序中的数据内容输出到文件中，也就是写文件
  
* 按照流的角色的不同分为**节点流**和**处理流**
    * 节点流主要指直接和输入输出源对接的流
    * 处理流主要指需要建立在节点流的基础之上的流
   
> 体系结构

|分类|字节输入流|字节输出流|字符输入流|字符输入流|
|:---|---|---|---|---|
|抽象基类|<font color='red'>InputStream|<font color='red'>OutputStream|<font color='red'>Reader|<font color='red'>Writer|
|访问文件|<font color='red'>FileInputStream|<font color='red'>FileOutputStream|<font color='red'>FileReader|<font color='red'>FileWriter|
|访问数组|ByteArrayInputStream|ByteArrayOutputStream|CharArrayReader|CharArrayWriter|
|访问管道|PipedInputStream|PipedOutputStream|PipedReader|PipedWriter|\
|访问字符串|--|--|StringReader|StringWriter|
|缓冲流|<font color='red'>BufferedInputStream|<font color='red'>BufferedOutputStream|BufferedReader|BufferedWriter|
|转换流|--|--|InputStreamReader|InputStreamWriter|
|对象流|<font color='red'>ObjectInputStream|<font color='red'>ObjectOutputStream|--|--|
||FilterInputStream|FilterOutputStream|FilterReader|FilterWriter|
|打印流|--|PrintStream|--|PrintWriter|
|推回输入流|PushbackInputStream|--|PushbackReader|--|
|特殊流|DataInputStream|DataOutputStream|--|--|