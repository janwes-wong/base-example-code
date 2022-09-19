package com.mytest;

public class Demo6 {
    public static void main(String[] args) {
        //静态初始化数组
        int[] arr = {1, 10, 15, 20, 25, 30};

        //调用方法传入参数并赋值
        String str = arrayToString(arr);

        //打印输出字符串结果
        System.out.println(str);
    }

    public static String arrayToString(int[] array) {
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        //遍历数组中的元素，并添加数据到StringBuilder对象中
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                sb.append(array[i]);
                sb.append(",");
            } else {
                sb.append(array[i]);
            }
        }
        sb.append("]");
        //StringBuilder 转换为 String
        String s = sb.toString();
        //返回给调用者
        return s;
    }
}
