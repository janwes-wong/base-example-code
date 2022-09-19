package com.exercise.file.filedemo;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("D:\\JavaEE基础班听课资料\\new");

        //public boolean delete() 删除由此File表示的文件或目录,返回结果为boolean类型
        boolean result = file.delete();
        System.out.println(result);
    }
}
