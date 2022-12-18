package com.javabase.secondSection;

import java.util.Scanner;
/**
 * 关键技术：
 * 使用一个或多个异或运算符对数据的信息进行加密
 * 具有可逆性
 * 输入A——》B
 * 输入B——》A
 *
 * 心法领悟：
 * 灵活运用位运算可以实现很多高级、高效的算法。
 * 例如，一个数字的位移运算，每左移n位就等于这个数乘以2的n次方，每右移n位就等于这个数除以2的n次方，而且这个算法非
 * */
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        //获取用户输入
        String password = scanner.nextLine();
        //获取字符数组
        char[] array = password.toCharArray();
        for (int i=0;i<array.length;i++){
            array[i] = (char) (array[i]^20000);
        }
        System.out.println("加密或解密的结果如下");
        System.err.println(new String(array));
    }
}
