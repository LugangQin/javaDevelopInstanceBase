package com.javabase.secondSection;

import java.util.Scanner;
/**
 * 关键技术：
 * 本实例的关键内容就是以三元运算符实现简单的条件判断。语法格式如下;条件运算?运算结果1:运算结果2;
 * 如果条件运算结果为true，返回值就是运算结果1，否则返回结果2。
 * 另外，本实例使用扫描器的 nextLong()方法直接获取整型数据，避免了类型转换等业务代码。该方法的声明格式如下:
 * public long nextLong0
 * 该方法返回一个 long类型的数值，这个数是从扫描器封装的输入流中获取的。
 *
 * 心灵领悟：
 * 灵活使用“%”运算符求余数。
 * “%”运算符的用途非常广泛，它能够实现数据分页，最简单的方法是可以通过计算奇偶数的方法把数组交叉分成两个数组。它还可以限制数字的范围，如(N%5==0)可以限制数字N在0~4的范围内。
 * */
public class ParityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long number = scanner.nextLong();
        String check = (number%2==0)?"这个数字是：偶数":"这个数字是：奇数";
        System.out.println(check);

    }
}
