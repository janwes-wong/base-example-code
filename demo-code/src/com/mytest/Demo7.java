package com.mytest;

public class Demo7 {
    public static void main(String[] args) {
        String str = "ABCEFG";
        //reverse(str);
        System.out.println(reverse(str));
    }

    /**
     * 此方法用于String字符串反转
     * @param s
     * @return
     */
    public static String reverse(String s) {
        String str = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }

        return str;
    }
}
