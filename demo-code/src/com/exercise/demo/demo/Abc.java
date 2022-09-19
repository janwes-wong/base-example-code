package com.exercise.demo.demo;

public class Abc {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        boolean b = num1 > num2 & num1 < num2;
        boolean c = num1 > num2 | num1 < num2;
        System.out.println(b);
        System.out.println(c);
        System.out.println(num1 > num2 & num1 < num2);//&遇false则false
        System.out.println(num1 > num2 | num1 < num2);
        System.out.println(num1 > num2 && num1 < num2);
        System.out.println(num1 > num2 || num1 < num2);
    }
}
