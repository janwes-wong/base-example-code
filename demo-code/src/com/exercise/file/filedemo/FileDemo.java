package com.exercise.file.filedemo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String pathName = "D:\\JavaEE基础班听课资料\\AB.txt";
        File file = new File(pathName);
        File file1 = new File("D:\\JavaEE基础班听课资料\\ABC.txt");
        File file2 = new File("D:\\JavaEE基础班听课资料\\ABC");

        /*
          exists()此方法返回boolean类型结果
          判断路径下的文件名是否存在
         */
        boolean result = file.exists();
        boolean result1 = file1.exists();
        //打印输出结果
        System.out.println(result);//false
        System.out.println(result1);//true

        /*
           getName()获取文件名或文件名.后缀
         */
        System.out.println("文件名称："+file1.getName());
        System.out.println("目录名称："+file2.getName());
    }
}
