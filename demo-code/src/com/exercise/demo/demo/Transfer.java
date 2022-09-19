package com.exercise.demo.demo;

public class Transfer {
    public static void main(String[] args) {
        /*
        类型转换
        1.隐式类型转换
        2.强制类型转换

        double>float>long>short>int>byte
         */
        int a = 10;
        double b = a;//隐式类型转换：将取值范围小的变量赋值给取值范围大的变量
        System.out.println(b);
        System.out.println("------------------");
        double c = 5.0;
        int c1 = (int)c;//强制类型转换：将取值范围大的变量赋值给取值范围小的变量
        System.out.println(c1);
        System.out.println("------------------");
        byte d = 125;
        double d1 = d;
        double e = 55.0;
        byte e1 = (byte)e;
        System.out.println(d1);
        System.out.println(e1);
        System.out.println("------------------");
        char f = 'a';
        byte f1 = (byte)f;//ASIIC编码表对应编码位置
        byte g = 98;
        char g1 = (char)g;
        char x = 97;//ASIIC编码表对应编码位置97--->a
        System.out.println(f1);
        System.out.println(g1);
        System.out.println(x);
        System.out.println("------------------");
        long l = 258741369L;
        double l1 = l;
        System.out.println(l1);
    }
}
