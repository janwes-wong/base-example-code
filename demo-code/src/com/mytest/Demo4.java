package com.mytest;


public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1) {
                s += arr[i];
                s += ",";
            }else {
                s += arr[i];
            }
        }
        s += "]";

        return s;
    }
}
