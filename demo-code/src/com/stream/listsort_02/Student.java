package com.stream.listsort_02;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream.listsort_02
 * @date 2021/5/19 16:22
 * @description
 */
public class Student implements Comparable<Student> {

    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // 按照姓名长度排序
        int num = name.length() - o.name.length();
        // 如果姓名长度相同，按照年龄排序
        if (num == 0) {
            return age - o.age;
        }
        return num;
    }
}
