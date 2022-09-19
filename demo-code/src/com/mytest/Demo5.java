package com.mytest;

public class Demo5 {
    public static void main(String[] args) {
        //静态初始化数组
        int[] arr = {2, 4, 6, 8};

        //创建StringBuilder对象，将调用的方法作为对象传入
        StringBuilder stringBuilder = new StringBuilder(arrayToString(arr));

        //StringBuilder 转换为 String
        String str = stringBuilder.toString();
        //打印输出字符串结果
        System.out.println(str);
    }

    /**
     * 此方法用于将数组的元素转换成String字符串类型
     * @param arr
     * @return
     */
    public static StringBuilder arrayToString(int[] arr) {
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                sb.append(arr[i]);
                sb.append(",");
            } else {
                sb.append(arr[i]);
            }
        }

        sb.append("]");
        //返回给调用者
        return sb;
    }
}
