package com.javabase.secondSection;

/**
 * 类：验证System.out.println()（快捷键sout）和System。err.println()（快捷键serr）两者的输出语句的区别。
 * 理论区别：前者输出的是黑色字体，后者输出的数红色字体。
 * */
public class PrintErrorAndDebug {
    public static void main(String[] args) {
        System.out.println("main方法开始运行了。");
        //输出错误信息
        System.err.println("在运行手动输出一个错误信息：");
        System.err.println("\t该软件没有买保险，请注意安全");
        System.out.println("PrintErrorAndDebug.main");
        System.out.println("main()方法运行结束了。");
    }
}
