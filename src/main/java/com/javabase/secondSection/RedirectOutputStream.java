package com.javabase.secondSection;

import java.io.PrintStream;
/**
 * 关键技术：
 * 本实例应用的关键技术是调用了System类的setOut()方法改变了输出流，System类的out、err和 in成员变量是final类型的，不能直接赋值，要通过相应的方法来改变流。下面分别介绍改变这3个成员变量的方法。
 * setout(方法
 * 该方法用于重新分配System类的标准输出流。该方法的声明如下:public static void setOut(PrintStream out)
 * 参数说明
 * out:新的 PrintStream输出流对象。setErr()方法
 * 该方法用于重新分配System类的标准错误输出流。该方法的声明如下:public static void setErr(PrintStream err)
 * 参数说明
 * err:新的PrintStream输出流对象。setIn(方法
 * 该方法用于重新设置System类的in成员变量，即标准输入流。该方法的声明如下:public static void setIn( InputStream in)
 * 参数说明
 * in:表示新的标准输出流。
 * */
public class RedirectOutputStream {
    public static void main(String[] args) {
        /**
         * 属性：保存原输出流。
         * */
        PrintStream out= System.out;
        /**
         * 属性：创建文件输出流
         * */
        try{
            PrintStream ps = new PrintStream(".log.txt");
            System.setOut(ps);
            int age = 18;
            System.out.println("年龄变量成功定义，初始值为18");
            String sex = "女";
            System.out.println("性别变量定义成功，初始值为女");
            //整合两个变量
            String info = "这是个"+sex+"孩子，应该有"+age+"岁";
            System.out.println("整合后的结果为"+info);
            System.setOut(out);
            System.out.println("程序运行完毕，请检查日志文件");
        }catch (Exception e){
            e.printStackTrace();
        }


    }



}
