package com.javabase.secondSection;

import java.util.Scanner;


/**
 * 关键技术：
 * 本实例计算闰年的关键技术是公式。满足这两个条件的整数可以称为闰年，第一，能被4整除但不能被100整除;第二，能被400整除。
 * 该公式用Java语法实现的格式如下:
 * year %4==0&& year %100!=O|| year %400==0
 *
 *心法领悟028:简单的if…-else语句。
 * 三元运算符“?:”是 if…else语句的一个简洁写法，开发人员可以根据需求来决定使用哪一种。if…else常用于赋值判断，而“?:”常用于业务流程。
 * year %4—0&& year %100!=Oll year %400—0
 * */
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = scanner.nextLong();
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
