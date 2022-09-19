package com.exam;

/**
 * @author Janwes
 * @version 1.0
 * @package com.exam
 * @date 2021/5/19 18:09
 * @description 字符串abc-defg反转为gfe-dcba
 */
public class ReverseChar {
    public static void main(String[] args) {
        String str = "a-bcdefg";
        String result = reverse(str);
        System.out.println(result);
    }

    /**
     * 此方法用于反转字符串
     *
     * @param str 字符串
     * @return
     */
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // 获取原字符串中"-"索引位
        int oldIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                oldIndex = i;
            }
        }

        // 遍历反转赋值
        char[] chars = new char[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '-') {
                index--;
            } else if (index == oldIndex) {
                chars[index] = '-';
                chars[index + 1] = str.charAt(i);
                index++;
            } else {
                chars[index] = str.charAt(i);
            }
            index++;
        }
        // 返回结果
        return new String(chars);
    }
}
