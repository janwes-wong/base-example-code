package com.exercise.file.filedemo;

import java.io.File;
import java.io.IOException;

public class UserInformation {
    public static void main(String[] args) throws IOException {
        File userInfoFile = new File("C:\\Users\\HZWJa\\Desktop\\userInfo.txt");

        //判断文件是否存在，若不存在就创建文件
        if (!userInfoFile.exists()) {
            userInfoFile.createNewFile();
        }
    }
}
