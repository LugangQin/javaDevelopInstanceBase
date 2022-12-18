package com.javabase.secondSection;

/**
 * 关键技术：
 * 1. 低类型可以向高类型的强制转换。
 * 2. 高类型向低类型的强制转化可能会造成数据丢失舍弃小数部分
 * 3.整数到字符类型的转换会获取对应的字符自编码
 *
 * 心法领悟022:
 * 注意加法运算与字符串的连接。
 * 在输出语句中，经常对输出的数字添加一个描述前缀。例如，“他的年龄是45”，但是如果“45”是一个数学加法的公式，那么会出现错误的运算。
 * 首先第一个数字与字符串会通过“+”符号实现字符串连接，而其后的所有数字加法运算都会被看作字符串的连接操作。解决办法是把所有数字加法用括号括起来。
 * */
public class TypeConversion {
    public static void main(String[] args) {
        byte b=127;
        char c='W';
        short s=23561;
        int i=3333;
        long l=400000L;
        float f=3.14159F;
        double d=54.523;
        //低类型向高类型的强制转换。
        System.out.println("累加byte等于："+b);
        System.out.println("累加char等于："+(b+c));
        System.out.println("累加short等于"+(b+c+s));
        System.out.println("累加int等于："+(b+c+s+i));
        System.out.println("…………");
        System.out.println("累加double等于："+(b+c+s+i+l+f));
        //高类型向低类型的强制转化
        System.out.println("把long强制类型转换为int"+(int)l);
        //高类型向地的类型转换会丢失数据
        System.out.println("把int强制转换为short"+(short)l);
        //实数到整数转换将舍弃小数部分。
        System.out.println("把double强制转换成int"+(int)d);
        //整数到字符类型的转换会获取对应的字符自编码
        System.out.println("把short强制类型转换为char："+(char)s);
    }
}
