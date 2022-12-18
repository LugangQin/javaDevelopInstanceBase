package com.javabase.secondSection;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 关键技术：
 * 左移运算符：使一个数乘以左移n个数的2的n次方。
 * 右移运算符：使一个数除以右移n个数的2的n次方。
 *
 *
 * 心法领悟026:奇妙的位移运算。
 * 通过实例可以看出，一个整数每次执行位移运算中的左移运算n次，相当于这个整数乘以2的n次方。相反，如果执行右移n次运算，则相当于这个整数除以2的n次方。
 * 这是比我们日常使用的“*”或者BigDecimal的multiply更为高效的有固定规律的乘法。
 * */
public class Example026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number = scanner.nextLong();
        System.out.println("你输入的数字是："+number);
        System.out.println("该数字乘以2的运算结果为："+(number<<1));
        System.out.println("该数字乘以4的运算结果为："+(number<<2));
        System.out.println("该数字乘以8的运算结果为："+(number<<3));
        System.out.println("该数字乘以16的运算结果为："+(number<<4));
    }
}
