package com.exercise.file.filedemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferedReaderTest1 {
    public static void main(String[] args) throws IOException {
        /*  本地文件中存在一些用户信息
            格式为：用户名1，密码1
                   用户名2，密码2
             将文件的数据读到内存中，封装为User对象并存入集合*/
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HZWJa\\Desktop\\userInfo.txt"));

        //创建集合用户对象
        ArrayList<User> list = new ArrayList<>();

        //读取数据
        String line;
        while ((line = br.readLine()) != null) {
            //将读取的字符串切割并赋值给字符串数组
            String[] userInfoArr = line.split(",");
            User user = new User();
            user.setUsername(userInfoArr[0]);
            user.setPassword(userInfoArr[1]);

            //将用户信息对象添加到集合中
            list.add(user);
        }

        br.close();

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername() + "---" + list.get(i).getPassword());
        }
    }
}
