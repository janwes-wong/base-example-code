package com.exercise.file.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserInfoText {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");

        //创建字符输出流，将集合元素数据写入本地指定路径文件
        FileWriter fw = new FileWriter(new File("C:\\Users\\HZWJa\\Desktop\\userinfo.txt"));

        //遍历集合中的元素并写入本地文件
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            fw.write(str);
            if (i < list.size() - 1) {
                fw.write(",");
            }
        }

        fw.close();
    }
}
