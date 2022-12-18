package com.javabase.secondSection;

import java.util.Scanner;



/**
 * 关键技术：
 * 异或运算符（常用来加密和交换值）
 *
 * 心法领悟027:别忘记赋值。
 * 异或“^”和其他位运算符并不会改变变量本身的值，即“A^B;”没有任何意义，必须将运算结果赋值给一个变量。一些开发人员经常犯此类错误。
 * */
public class VariableExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入变量A的值：");
        long A = scanner.nextLong();
        System.out.println("请输入变量B的值：");
        long B = scanner.nextLong();
        System.out.println("A=" + A + "\tB=" + B);
        A = A ^ B;
        B = B ^ A;
        A = A ^ B;
        System.out.println("A=" + A + "\tB=" + B);
    }
}
