package com.javabase.secondSection;

import java.math.BigDecimal;

/**
 * 关键技术：
 * 本实例在完成浮点数精确计算的过程中使用了BigDecimal类，它用于大数字的精确计算。本实例调用了该类的subtract(方法实现减法运算。下面介绍该类的运算方法。
 * 加法
 * 该方法实现两个 BigDecimal类实例对象的加法运算，并将运算结果作为方法的返回值。该方法的声明如下:public BigDecimal add(BigDecimal augend)
 * 参数说明
 * augend:与当前对象执行加法的操作数。
 *
 * 减法
 * 该方法实现两个 BigDecimal类实例对象的减法运算，并将运算结果作为方法的返回值。该方法的声明如下:public BigDecimal subtract(BigDecimal subtrahend)
 * 参数说明
 * subtrahend:被当前对象执行减法的操作数。
 *
 * 乘法
 * 该方法实现两个 BigDecimal类实例对象的乘法运算，并将运算结果作为方法的返回值。该方法的声明如下:public BigDecimal multiply(BigDecimal multiplicand)
 * 参数说明
 * multiplicand:乘法运算中的乘数。
 *
 * 除法
 * 该方法实现两个 BigDecimal类实例对象的除法运算，并将运算结果作为方法的返回值。该方法的声明如下:public BigDecimal divide(BigDecimal divisor)
 * 参数说明
 * divisor:除法运算中的除数。
 * */
public class AccuratelyFloat {
    public static void main(String[] args) {
        double money = 2;//现有金额
        double price = 1.1;//商品价格
        double result =money - price;
        System.out.println("非精确计算");
        System.out.println("剩余金额："+result);
        //精确浮点数的解决方法
        BigDecimal money1 = new BigDecimal("2");
        BigDecimal price1 = new BigDecimal("1.1");
        BigDecimal result2 = money1.subtract(price1);
        System.out.println("精确的计算：");
        System.out.println("剩余金额："+result2);
    }
}
