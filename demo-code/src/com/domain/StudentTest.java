package com.domain;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student("尼古拉斯·赵四",25);//创建Student类stu对象
        Student stu1 = new Student();
        //为setName方法传入参数
        stu1.setName("小罗伯特唐尼");
        //为setAge方法传入参数
        stu1.setAge(25);
        //调用show方法
        stu.show();
        stu1.show();
    }
}
