package com.javabase.secondSection;

import java.util.Scanner;


/**
 * 关键技术
 * 本实例的关键技术就是用到了System类的输入流也就是类变量in，它可以接收用户的输入信息，并且是标准的输入流实例对象。另外，Scanner类是Java的扫描器类，
 * 它可以从输入流中读取指定类型的数据或字符串。本实例使用Scanner类封装了输入流对象，并使用nextLine()方法从输入流中获取用户输入的整行文本字符串，该方法的声明如下:
 * public String nextLine()
 * 该方法从扫描器封装的输入流中获取一行文本字符串作为方法的返回值
 * */
public class InputCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号：");
        String line = scanner.nextLine();
        //打印对输出文本的描述
        System.out.println("原来你的身份证号是："+line.length()+"为数字啊！！");
    }
}
