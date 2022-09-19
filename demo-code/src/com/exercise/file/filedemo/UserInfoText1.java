package com.exercise.file.filedemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserInfoText1 {
    public static void main(String[] args) throws IOException {
        //创建集合
        ArrayList<User> list = new ArrayList<>();

        //添加用户对象到集合
        list.add(new User("zhansan","123"));
        list.add(new User("lisi","123456"));
        list.add(new User("wangwu","qwer"));

        //创建字符输出流，将集合元素数据写入本地指定路径文件
        FileWriter fw = new FileWriter(new File("C:\\Users\\HZWJa\\Desktop\\userInfo.txt"));

        //遍历集合得到每一个用户对象，将用户信息写入本地文件
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            fw.write(user.getUsername());
            fw.write(",");
            fw.write(user.getPassword());
            //换行
            fw.write("\r\n");
        }

        //释放资源
        fw.close();
    }
}
